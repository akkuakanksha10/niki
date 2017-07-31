package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sales_bill_detail database table.
 * 
 */
@Entity
@Table(name="sales_bill_detail")
@NamedQuery(name="SalesBillDetail.findAll", query="SELECT s FROM SalesBillDetail s")
public class SalesBillDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SALES_BILL_DETAIL_ID")
	private String salesBillDetailId;

	private double price;

	private double quantity;

	@Column(name="TOTAL_PRICE")
	private double totalPrice;

	//bi-directional many-to-one association to Item
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	private Item item;

	//bi-directional many-to-one association to SalesBill
	@ManyToOne
	@JoinColumn(name="SALES_BILL_ID")
	private SalesBill salesBill;

	public SalesBillDetail() {
	}

	public String getSalesBillDetailId() {
		return this.salesBillDetailId;
	}

	public void setSalesBillDetailId(String salesBillDetailId) {
		this.salesBillDetailId = salesBillDetailId;
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

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public SalesBill getSalesBill() {
		return this.salesBill;
	}

	public void setSalesBill(SalesBill salesBill) {
		this.salesBill = salesBill;
	}

}