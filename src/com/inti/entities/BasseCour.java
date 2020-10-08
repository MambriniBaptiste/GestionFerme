package com.inti.entities;

public class BasseCour extends Animal {

	private static final long serialVersionUID = 1L;
	private String habitat;
	
	public BasseCour(boolean etat, String habitat) {
		super(etat);
		this.habitat = habitat;
	}

	public BasseCour(boolean etat) {
		super(etat);
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "BasseCour [habitat=" + habitat + "]";
	}
}
