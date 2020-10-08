package com.inti.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Ferme;
import com.inti.service.interfaces.IService;
import com.inti.services.impl.ManagerServiceImpl;

@WebServlet("/ListingFermes")
public class ListingFermes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IService<Ferme> fermeService = new ManagerServiceImpl<>();
      
    public ListingFermes() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("fermes", fermeService.findAll(Ferme.class));
		request.getRequestDispatcher("/WEB-INF/listFermes.jsp").forward(request, response);
	}
}
