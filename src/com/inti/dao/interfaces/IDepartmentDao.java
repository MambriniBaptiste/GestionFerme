package com.inti.dao.interfaces;

import com.inti.entities.Department;

public interface IDepartmentDao {
	Department findWithNameAndRegion(String nomDepartment, String regionDepartment);
}
