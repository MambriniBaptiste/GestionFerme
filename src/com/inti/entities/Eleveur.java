package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Eleveur implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEleveur;
	private String nomEleveur;
	private int age;
	private boolean statut;
	
	@OneToMany
	Set<Animal> animaux = new HashSet<>();
	
	public Eleveur(String nomEleveur, int age, boolean statut) {
		this.nomEleveur = nomEleveur;
		this.age = age;
		this.statut = statut;
	}

	public Eleveur() {
	}

	public Long getIdEleveur() {
		return idEleveur;
	}

	public void setIdEleveur(Long idEleveur) {
		this.idEleveur = idEleveur;
	}

	public String getNomEleveur() {
		return nomEleveur;
	}

	public void setNomEleveur(String nomEleveur) {
		this.nomEleveur = nomEleveur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "Eleveur [nomEleveur=" + nomEleveur + ", age=" + age + ", statut=" + statut + "]";
	}
}
