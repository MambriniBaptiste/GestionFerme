package com.inti.service.interfaces;

import java.util.Date;

import com.inti.entities.Ferme;

public interface IFermeService extends IService<Ferme> {
	Ferme findWithNameAndDate(String nomFerme, Date dateAchat);
}
