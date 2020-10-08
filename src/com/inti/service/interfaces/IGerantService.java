package com.inti.service.interfaces;

import com.inti.entities.Gerant;

public interface IGerantService extends IService<Gerant> {
	Gerant findWithNameAndPrenom(String nomGerant, String prenomGerant);
}
