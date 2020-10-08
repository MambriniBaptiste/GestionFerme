package com.inti.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Animal;
import com.inti.service.interfaces.IService;
import com.inti.services.impl.ManagerServiceImpl;

@WebServlet("/ListAnimaux")
public class ListingAnimaux extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IService<Animal> animalService = new ManagerServiceImpl<>();
	
    public ListingAnimaux() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("animaux", animalService.findAll(Animal.class));
		request.getRequestDispatcher("/WEB-INF/listAnimaux.jsp").forward(request, response);
	}
}