package com.inti.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Ferme;
import com.inti.service.interfaces.IService;
import com.inti.services.impl.ManagerServiceImpl;

@WebServlet("/AjoutFerme")
public class AjoutFerme extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IService<Ferme> fermeService = new ManagerServiceImpl<>();
 
    public AjoutFerme() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat dateA = new SimpleDateFormat("dd/MM/yyyy");
		try {
			fermeService.save(new Ferme(request.getParameter("nomFerme"), dateA.parse(request.getParameter("dateAchat"))));
			request.getRequestDispatcher("/WEB-INF/listFermes.jsp").forward(request, response);
		} catch(ParseException e) {
			e.printStackTrace();
		}
	}
}
