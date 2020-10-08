package com.inti.services.impl;

import com.inti.dao.impl.DepartmentDaoImpl;
import com.inti.dao.interfaces.IDepartmentDao;
import com.inti.entities.Department;
import com.inti.service.interfaces.IDepartmentService;

public class DepartmentServiceImpl extends ManagerServiceImpl<Department> implements IDepartmentService {
	IDepartmentDao departmentDao = new DepartmentDaoImpl();

	@Override
	public Department findWithNameAndRegion(String nomDepartment, String regionDepartment) {
		return departmentDao.findWithNameAndRegion(nomDepartment, nomDepartment);
	}
}
