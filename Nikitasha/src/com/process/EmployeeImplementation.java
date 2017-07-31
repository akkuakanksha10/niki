package com.process;


import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.dao.RestFactory;
import com.dao.SeqController;

import com.model.Employee;
import com.model.Seq;
;

public class EmployeeImplementation extends RestFactory{
	private RestFactory factory;
	private SeqController controller;
	
	public Employee saveEmployee(Employee employee){
		try {
			Seq s=controller.findEmployeeSequence();
			employee.setEmpId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employee;
	}
	public Employee updateEmployee(Employee employee){
		try {
			factory.update(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employee;
	}
	public List<Employee> getEmployees(){
		try {
			List<Employee> employeeList=(List<Employee>)factory.getObjectList(Employee.class);
			return employeeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
