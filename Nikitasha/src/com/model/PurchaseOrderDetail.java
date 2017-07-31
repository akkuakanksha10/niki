package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the purchase_order_detail database table.
 * 
 */
@Entity
@Table(name="purchase_order_detail")
@NamedQuery(name="PurchaseOrderDetail.findAll", query="SELECT p FROM PurchaseOrderDetail p")
public class PurchaseOrderDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="POD_ID")
	private String podId;

	private double price;

	private double quantity;

	@Column(name="TOTAL_AMOUNT")
	private double totalAmount;

	private String unit;

	//bi-directional many-to-one association to Item
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	private Item item;

	//bi-directional many-to-one association to PurchaseOrder
	@ManyToOne
	@JoinColumn(name="PURCHASE_ORDER_ID")
	private PurchaseOrder purchaseOrder;

	public PurchaseOrderDetail() {
	}

	public String getPodId() {
		return this.podId;
	}

	public void setPodId(String podId) {
		this.podId = podId;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public PurchaseOrder getPurchaseOrder() {
		return this.purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

}