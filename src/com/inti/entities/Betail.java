package com.inti.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("betail")
public class Betail extends Animal {

	private static final long serialVersionUID = 1L;
	private String techElevage;
	
	public Betail(boolean etat, String techElevage) {
		super(etat);
		this.techElevage = techElevage;
	}

	public Betail() {
		super();
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
