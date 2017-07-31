package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.Employee;
import com.model.EmployeeRoleMapping;
import com.model.Seq;

public class EmployeeRoleMappingImplementation extends RestFactory{
	private RestFactory factory;
	private SeqController controller;
	
	public EmployeeRoleMapping saveEmployeeRoleMapping(EmployeeRoleMapping employeeRoleMapping){
		try {
			Seq s=controller.findEmployeeRoleMappingSequence();
			employeeRoleMapping.setApplicationRoleId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(employeeRoleMapping);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeeRoleMapping;
	}
	public EmployeeRoleMapping updateEmployeeRoleMapping(EmployeeRoleMapping employeeRoleMapping){
		try {
			factory.update(employeeRoleMapping);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeeRoleMapping;
	}
	public List<EmployeeRoleMapping> getEmployeeRoles(){
		try {
			List<EmployeeRoleMapping> employeeRoleList=(List<EmployeeRoleMapping>)factory.getObjectList(EmployeeRoleMapping.class);
			return employeeRoleList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
