package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gerant implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGerant;
	private String nomGerant;
	private String prenomGerant;
	
	public Gerant(String nomGerant, String prenomGerant) {
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
	}

	public Gerant() {
	}

	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNomGerant() {
		return nomGerant;
	}

	public void setNomGerant(String nomGerant) {
		this.nomGerant = nomGerant;
	}

	public String getPrenomGerant() {
		return prenomGerant;
	}

	public void setPrenomGerant(String prenomGerant) {
		this.prenomGerant = prenomGerant;
	}

	@Override
	public String toString() {
		return "Gerant [nomGerant=" + nomGerant + ", prenomGerant=" + prenomGerant + "]";
	}
}
