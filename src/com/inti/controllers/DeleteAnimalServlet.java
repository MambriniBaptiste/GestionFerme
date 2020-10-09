package com.inti.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Animal;
import com.inti.services.impl.ManagerServiceImpl;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteAnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      ManagerServiceImpl animalService = new ManagerServiceImpl();
  
    public DeleteAnimalServlet() {
        super();
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idAnimal = Long.parseLong(request.getParameter("pId"));
		Animal a= (Animal) animalService.findOne(Animal.class, idAnimal);
		animalService.remove(a);
		request.setAttribute("animaux", animalService.findAll(Animal.class));
		request.getRequestDispatcher("listAnimaux.jsp").forward(request, response);
	}
	


}
