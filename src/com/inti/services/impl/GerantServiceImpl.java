package com.inti.services.impl;

import com.inti.dao.impl.GerantDaoImpl;
import com.inti.dao.interfaces.IGerantDao;
import com.inti.entities.Gerant;
import com.inti.service.interfaces.IGerantService;

public class GerantServiceImpl extends ManagerServiceImpl<Gerant> implements IGerantService{
	IGerantDao gerantDao = new GerantDaoImpl();

	@Override
	public Gerant findWithNameAndPrenom(String nomGerant, String prenomGerant) {
		return gerantDao.findWithNameAndPrenom(nomGerant, prenomGerant);
	}
}
