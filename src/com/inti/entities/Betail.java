package com.inti.entities;

public class Betail extends Animal {

	private static final long serialVersionUID = 1L;
	private String techElevage;
	
	public Betail(boolean etat, String techElevage) {
		super(etat);
		this.techElevage = techElevage;
	}

	public Betail(boolean etat) {
		super(etat);
	}

	public String getTechElevage() {
		return techElevage;
	}

	public void setTechElevage(String techElevage) {
		this.techElevage = techElevage;
	}

	@Override
	public String toString() {
		return "Betail [techElevage=" + techElevage + "]";
	}
}
