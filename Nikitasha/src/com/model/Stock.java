package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STOCK_ID")
	private String stockId;

	@Column(name="MAX_STOCK")
	private double maxStock;

	@Column(name="MIN_STOCK")
	private double minStock;
	@Column(name="QUANTITY")
	private double quantity;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECORD_TIME")
	private Date recordTime;
	@Column(name ="STATUS")
	private boolean status;

	@Column(name="STORAGE_ID")
	private String storageId;

	//bi-directional many-to-one association to ItemDetail
	@ManyToOne
	@JoinColumn(name="ITEM_DETAIL_ID")
	private ItemDetail itemDetail;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="UOM_ID")
	private Uom uom;

	public Stock() {
	}

	public String getStockId() {
		return this.stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public double getMaxStock() {
		return this.maxStock;
	}

	public void setMaxStock(double maxStock) {
		this.maxStock = maxStock;
	}

	public double getMinStock() {
		return this.minStock;
	}

	public void setMinStock(double minStock) {
		this.minStock = minStock;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Date getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getStorageId() {
		return this.storageId;
	}

	public void setStorageId(String storageId) {
		this.storageId = storageId;
	}

	public ItemDetail getItemDetail() {
		return this.itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}

}