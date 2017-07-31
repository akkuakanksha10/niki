package com.process;


import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.dao.RestFactory;
import com.dao.SeqController;

import com.model.Employee;
import com.model.EmployeeRoleMapping;
import com.model.FacebookLike;
import com.model.Rating;
import com.model.Seq;
import com.model.User;
import com.model.Vendor;
;

public class EmployeeImplementation extends RestFactory{
	private SeqController controller;
	
	
	
	public SeqController getController() {
		if(controller==null){
			controller=new SeqController();
		}
		return controller;
	}
	public void setController(SeqController controller) {
		this.controller = controller;
	}
	
	
	public Employee saveEmployee(Employee employee){
		try {
			Seq s=controller.findEmployeeSequence();
			String strq=s.getKey();
			employee.setEmpId(strq);
			s.increment();
			update(s);
			save(employee);
			return employee;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
		
	}
	public Employee updateEmployee(Employee employee){
		try {
			update(employee);

			return employee;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public List<Employee> getEmployees(){
		try {
			List<Employee> employeeList=(List<Employee>)getObjectList(Employee.class);
			return employeeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/************************************ EmployeeRoleMapping ****************************************************/
	
	public EmployeeRoleMapping saveEmployeeRoleMapping(EmployeeRoleMapping employeeRoleMapping){
		try {
			Seq s=getController().findEmployeeRoleMappingSequence();
			String strq=s.getKey();
			employeeRoleMapping.setApplicationRoleId(strq);
			s.increment();
			update(s);
			save(employeeRoleMapping);
			return employeeRoleMapping;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public EmployeeRoleMapping updateEmployeeRoleMapping(EmployeeRoleMapping employeeRoleMapping){
		try {
			update(employeeRoleMapping);
			return employeeRoleMapping;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public List<EmployeeRoleMapping> getEmployeeRoles(){
		try {
			List<EmployeeRoleMapping> employeeRoleList=(List<EmployeeRoleMapping>)getObjectList(EmployeeRoleMapping.class);
			return employeeRoleList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/******************************************* USER *******************************************************/
	
	public User saveUser(User user){
		try {
			Seq s=getController().findUserSequence();
			String strq=s.getKey();
			user.setUserId(strq);
			update(s);
			save(user);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public User updateUser(User user){
		try {
			update(user);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<User> getUsers(){
		try {
			List<User> userList=(List<User>)getObjectList(User.class);
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	/*********************************************Facebook Like *********************************************/
	
	public FacebookLike saveFacebookLike(FacebookLike facebookLike){
		try {
			Seq s=getController().findFacebookLikeSequence();
			String strq=s.getKey();
			facebookLike.setFacebookLikeId(strq);
			s.increment();
			update(s);
			save(facebookLike);
			return facebookLike;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public FacebookLike updateFacebookLike(FacebookLike facebookLike){
		try {
			update(facebookLike);
			return facebookLike;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public List<FacebookLike> getFacebookLikes(){
		try {
			List<FacebookLike> fbLikeList=(List<FacebookLike>)getObjectList(FacebookLike.class);
			return fbLikeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	/**********************************************Rating ****************************************************/
	
	public Rating saveRating(Rating rating){
		try {
			Seq s=getController().findUserSequence();
			String strq=s.getKey();
			rating.setRateId(strq);
			update(s);
			save(rating);
			return rating;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public Rating updateRating(Rating rating){
		try {
			update(rating);
			return rating;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Rating> getRatings(){
		try {
			List<Rating> ratingList=(List<Rating>)getObjectList(Rating.class);
			return ratingList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
