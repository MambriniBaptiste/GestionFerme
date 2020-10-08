package com.inti.dao.interfaces;

import java.util.Date;

import com.inti.entities.Ferme;

public interface IFermeDao {
	Ferme findWithNameAndDate(String nomFerme, Date dateAchat);
}
