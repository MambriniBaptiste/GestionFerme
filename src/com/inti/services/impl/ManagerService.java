package com.inti.services.impl;

import java.util.List;

import com.inti.dao.impl.ManagerDaoImpl;
import com.inti.dao.interfaces.IDao;

public class ManagerService<T> implements IDao<T> {
	IDao<T> dao = new ManagerDaoImpl<>();

	@Override
	public void save(T obj) {
		dao.save(obj);	
	}

	@Override
	public void update(T obj) {
		dao.update(obj);
	}

	@Override
	public void remove(T obj) {
		dao.remove(obj);
	}

	@Override
	public List<T> findAll(Class<?> c) {
		return dao.findAll(c);
	}

	@Override
	public T findOne(Class<?> c, long id) {
		return dao.findOne(c, id);
	}
}
