package com.inti.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Eleveur;
import com.inti.service.interfaces.IService;
import com.inti.services.impl.ManagerServiceImpl;

@WebServlet("/ajoutEleveur")
public class AjoutEleveur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IService<Eleveur> eleveurService = new ManagerServiceImpl<>();

    public AjoutEleveur() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ajoutEleveur.jsp").forward(request, response);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean statut = Boolean.parseBoolean(request.getParameter("statut"));
		int age = Integer.parseInt(request.getParameter("age"));
		eleveurService.save(new Eleveur(request.getParameter("nomEleveur"), age, statut));
		request.getRequestDispatcher("/WEB-INF/listEleveurs.jsp").forward(request, response);
	}
}
