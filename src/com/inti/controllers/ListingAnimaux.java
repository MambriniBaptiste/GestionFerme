package com.inti.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.inti.dao.impl.ManagerDaoImpl;
import com.inti.entities.Animal;
import com.inti.service.interfaces.IService;
import com.inti.services.impl.ManagerServiceImpl;

@WebServlet("/listAnimaux")
public class ListingAnimaux extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IService<Animal> animalService = new ManagerServiceImpl<>();
	
    public ListingAnimaux() {
        super();
    }
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Animal> listAnimaux = new ArrayList<Animal>();
        listAnimaux = ManagerDaoImpl.getAllAnimals();
        PrintWriter pw = resp.getWriter();
        req.setAttribute("animals", listAnimaux );
        req.getRequestDispatcher("/WEB-INF/listAnimaux.jsp");
        	
}
}

	

