package com.inti.utils;

import com.inti.dao.impl.ManagerDaoImpl;
import com.inti.entities.Animal;

public class Main {

	public static void main(String[] args) {
	Animal animal = new Animal();
	animal.setEtat(true);
	ManagerDaoImpl dao = new ManagerDaoImpl();
	dao.save(animal);;
	System.out.println(animal.toString());
	

	}

}
