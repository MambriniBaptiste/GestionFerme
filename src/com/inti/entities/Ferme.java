package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ferme implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFerme;
	private String nomFerme;
	private Date dateAchat;
	
	@ManyToOne
	private Department department;
	
	@OneToMany(mappedBy = "fermeGerants", fetch = FetchType.EAGER)
	Set<Gerant> gerants = new HashSet<>();
	
	@OneToMany(mappedBy = "fermeAnimaux", fetch = FetchType.EAGER)
	Set<Animal> animaux = new HashSet<>();
	
	public Ferme(String nomFerme, Date dateAchat) {
		this.nomFerme = nomFerme;
		this.dateAchat = dateAchat;
	}

	public Ferme() {
	}

	public Long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNomFerme() {
		return nomFerme;
	}

	public void setNomFerme(String nomFerme) {
		this.nomFerme = nomFerme;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	@Override
	public String toString() {
		return "Ferme [nomFerme=" + nomFerme + ", dateAchat=" + dateAchat + "]";
	}
}
