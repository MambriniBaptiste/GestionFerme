package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDepartment;
	private String nomDepartment;
	private String regionDepartment;
	
	public Department(String nomDepartment, String regionDepartment) {
		this.nomDepartment = nomDepartment;
		this.regionDepartment = regionDepartment;
	}

	public Department() {
	}

	public Long getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Long idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getNomDepartment() {
		return nomDepartment;
	}

	public void setNomDepartment(String nomDepartment) {
		this.nomDepartment = nomDepartment;
	}

	public String getRegionDepartment() {
		return regionDepartment;
	}

	public void setRegionDepartment(String regionDepartment) {
		this.regionDepartment = regionDepartment;
	}

	@Override
	public String toString() {
		return "Department [nomDepartment=" + nomDepartment + ", regionDepartment=" + regionDepartment + "]";
	}
}
