package com.inti.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Betail;
import com.inti.service.interfaces.IService;
import com.inti.services.impl.ManagerServiceImpl;

@WebServlet("/ajoutBetail")
public class AjoutBetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IService<Betail> betailService = new ManagerServiceImpl<>();

    public AjoutBetail() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ajoutBetail.jsp").forward(request, response);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean etat = Boolean.parseBoolean(request.getParameter("etat"));
		betailService.save(new Betail(etat, request.getParameter("techElevage")));
		request.getRequestDispatcher("/WEB-INF/listAnimaux.jsp").forward(request, response);
	}
}
