package com.inti.service.interfaces;

import com.inti.entities.Department;

public interface IDepartmentService extends IService<Department>{
	Department findWithNameAndRegion(String nomDepartment, String regionDepartment);
}
