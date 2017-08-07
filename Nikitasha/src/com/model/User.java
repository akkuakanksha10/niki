package com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private String userId;

	@Column(name="EMAIL_ID")
	private String emailId;

	@Column(name="USER_NAME")
	private String userName;

	@OneToMany(mappedBy="userId")
	private List<FacebookLike> facebookLikeList;
	
	
	
	public List<FacebookLike> getFacebookLikeList() {
		return facebookLikeList;
	}

	public void setFacebookLikeList(List<FacebookLike> facebookLikeList) {
		this.facebookLikeList = facebookLikeList;
	}

	public User() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}