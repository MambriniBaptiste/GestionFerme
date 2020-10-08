package com.inti.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.inti.dao.interfaces.IDepartmentDao;
import com.inti.entities.Department;
import com.inti.utils.HibernateUtility;

public class DepartmentDaoImpl extends ManagerDaoImpl<Department> implements IDepartmentDao{

	@Override
	public Department findWithNameAndRegion(String nomDepartment, String regionDepartment) {
		Session s = HibernateUtility.getSessionFactory().openSession();
		Department dep;
		try {
			s.getTransaction().begin();
			Query queryHQL = s.createQuery(" from Department where nomDepartment=:nomDepartment and regionDepartment=:regionDepartment");
			queryHQL.setParameter("nomDepartment", nomDepartment);
			queryHQL.setParameter("regionDepartment", regionDepartment);
			dep = (Department) queryHQL.uniqueResult();
			s.getTransaction().commit();
			s.close();
			return dep;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
