package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the item database table.
 * 
 */
@Entity
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ITEM_ID")
	private String itemId;

	private String name;

	//bi-directional many-to-one association to FacebookLike
	@OneToMany(mappedBy="item")
	private List<FacebookLike> facebookLikes;

	//bi-directional many-to-one association to ItemType
	@ManyToOne
	@JoinColumn(name="ITEM_TYPE_ID")
	private ItemType itemType;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="UOM_ID")
	private Uom uom;

	//bi-directional many-to-one association to ItemDetail
	@OneToMany(mappedBy="item")
	private List<ItemDetail> itemDetails;

	//bi-directional many-to-one association to PurchaseOrderDetail
	@OneToMany(mappedBy="item")
	private List<PurchaseOrderDetail> purchaseOrderDetails;

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="item")
	private List<Rating> ratings;

	//bi-directional many-to-one association to SalesBillDetail
	@OneToMany(mappedBy="item")
	private List<SalesBillDetail> salesBillDetails;

	public Item() {
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FacebookLike> getFacebookLikes() {
		return this.facebookLikes;
	}

	public void setFacebookLikes(List<FacebookLike> facebookLikes) {
		this.facebookLikes = facebookLikes;
	}

	public FacebookLike addFacebookLike(FacebookLike facebookLike) {
		getFacebookLikes().add(facebookLike);
		facebookLike.setItem(this);

		return facebookLike;
	}

	public FacebookLike removeFacebookLike(FacebookLike facebookLike) {
		getFacebookLikes().remove(facebookLike);
		facebookLike.setItem(null);

		return facebookLike;
	}

	public ItemType getItemType() {
		return this.itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}

	public List<ItemDetail> getItemDetails() {
		return this.itemDetails;
	}

	public void setItemDetails(List<ItemDetail> itemDetails) {
		this.itemDetails = itemDetails;
	}

	public ItemDetail addItemDetail(ItemDetail itemDetail) {
		getItemDetails().add(itemDetail);
		itemDetail.setItem(this);

		return itemDetail;
	}

	public ItemDetail removeItemDetail(ItemDetail itemDetail) {
		getItemDetails().remove(itemDetail);
		itemDetail.setItem(null);

		return itemDetail;
	}

	public List<PurchaseOrderDetail> getPurchaseOrderDetails() {
		return this.purchaseOrderDetails;
	}

	public void setPurchaseOrderDetails(List<PurchaseOrderDetail> purchaseOrderDetails) {
		this.purchaseOrderDetails = purchaseOrderDetails;
	}

	public PurchaseOrderDetail addPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		getPurchaseOrderDetails().add(purchaseOrderDetail);
		purchaseOrderDetail.setItem(this);

		return purchaseOrderDetail;
	}

	public PurchaseOrderDetail removePurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		getPurchaseOrderDetails().remove(purchaseOrderDetail);
		purchaseOrderDetail.setItem(null);

		return purchaseOrderDetail;
	}

	public List<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Rating addRating(Rating rating) {
		getRatings().add(rating);
		rating.setItem(this);

		return rating;
	}

	public Rating removeRating(Rating rating) {
		getRatings().remove(rating);
		rating.setItem(null);

		return rating;
	}

	public List<SalesBillDetail> getSalesBillDetails() {
		return this.salesBillDetails;
	}

	public void setSalesBillDetails(List<SalesBillDetail> salesBillDetails) {
		this.salesBillDetails = salesBillDetails;
	}

	public SalesBillDetail addSalesBillDetail(SalesBillDetail salesBillDetail) {
		getSalesBillDetails().add(salesBillDetail);
		salesBillDetail.setItem(this);

		return salesBillDetail;
	}

	public SalesBillDetail removeSalesBillDetail(SalesBillDetail salesBillDetail) {
		getSalesBillDetails().remove(salesBillDetail);
		salesBillDetail.setItem(null);

		return salesBillDetail;
	}

}