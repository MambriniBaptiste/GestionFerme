package com.inti.dao.interfaces;

import com.inti.entities.Gerant;

public interface IGerantDao {
	Gerant findWithNameAndPrenom(String nomGerant, String prenomGerant);
}
