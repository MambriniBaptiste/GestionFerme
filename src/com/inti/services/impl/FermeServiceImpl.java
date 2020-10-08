package com.inti.services.impl;

import java.util.Date;

import com.inti.dao.impl.FermeDaoImpl;
import com.inti.dao.interfaces.IFermeDao;
import com.inti.entities.Ferme;
import com.inti.service.interfaces.IFermeService;

public class FermeServiceImpl extends ManagerService<Ferme> implements IFermeService{
	IFermeDao fermeDao = new FermeDaoImpl();

	@Override
	public Ferme findWithNameAndDate(String nomFerme, Date dateAchat) {
		return fermeDao.findWithNameAndDate(nomFerme, dateAchat);
	}
}
