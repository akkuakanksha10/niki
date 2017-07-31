package com.process;


import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.dao.RestFactory;
import com.dao.SeqController;

import com.model.Employee;
import com.model.EmployeeRoleMapping;
import com.model.FacebookLike;
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
	
	/************************************ EmployeeRoleMapping ****************************************************/
	
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
	
	/******************************************* USER *******************************************************/
	
	
	/*********************************************Facebook Like *********************************************/
	
	public FacebookLike saveFacebookLike(FacebookLike facebookLike){
		try {
			Seq s=controller.findFacebookLikeSequence();
			facebookLike.setFacebookLikeId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(facebookLike);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return facebookLike;
	}
	public FacebookLike updateFacebookLike(FacebookLike facebookLike){
		try {
			factory.update(facebookLike);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return facebookLike;
	}
	public List<FacebookLike> getFacebookLikes(){
		try {
			List<FacebookLike> fbLikeList=(List<FacebookLike>)factory.getObjectList(FacebookLike.class);
			return fbLikeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	/**********************************************Rating ****************************************************/
	
}
