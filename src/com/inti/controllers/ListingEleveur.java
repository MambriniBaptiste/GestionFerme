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

@WebServlet("/ListingEleveur")
public class ListingEleveur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IService<Eleveur> eleveurService = new ManagerServiceImpl<>();
 
    public ListingEleveur() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("eleveurs", eleveurService.findAll(Eleveur.class));
		request.getRequestDispatcher("/WEB-INF/listEleveurs.jsp").forward(request, response);
	}
}
