package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the facebook_like database table.
 * 
 */
@Entity
@Table(name="facebook_like")
@NamedQuery(name="FacebookLike.findAll", query="SELECT f FROM FacebookLike f")
public class FacebookLike implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FACEBOOK_LIKE_ID")
	private String facebookLikeId;

	@Column(name="FACEBOOK_LIKE")
	private int facebookLike;

	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User userId;

	//bi-directional many-to-one association to Item
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	private Item item;

	public FacebookLike() {
	}

	public String getFacebookLikeId() {
		return this.facebookLikeId;
	}

	public void setFacebookLikeId(String facebookLikeId) {
		this.facebookLikeId = facebookLikeId;
	}

	public int getFacebookLike() {
		return this.facebookLike;
	}

	public void setFacebookLike(int facebookLike) {
		this.facebookLike = facebookLike;
	}

	public User getUserId() {
		return this.userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}