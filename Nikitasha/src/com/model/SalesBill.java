package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sales_bill database table.
 * 
 */
@Entity
@Table(name="sales_bill")
@NamedQuery(name="SalesBill.findAll", query="SELECT s FROM SalesBill s")
public class SalesBill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SALES_BILL_ID")
	private String salesBillId;

	@Column(name="CONTACT_NO")
	private String contactNo;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_ON")
	private Date createdOn;

	@Column(name="CUSTOMER_EMAIL")
	private String customerEmail;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="IS_OPEN")
	private boolean isOpen;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="SERVICE_CHAGRE")
	private double serviceChagre;

	@Column(name="TOTAL_AMOUNT")
	private double totalAmount;

	@Column(name="TOTAL_PRICE")
	private double totalPrice;

	@Column(name="TOTAL_TAX")
	private double totalTax;

	//bi-directional many-to-one association to SalesBillDetail
	@OneToMany(mappedBy="salesBill")
	private List<SalesBillDetail> salesBillDetails;

	public SalesBill() {
	}

	public String getSalesBillId() {
		return this.salesBillId;
	}

	public void setSalesBillId(String salesBillId) {
		this.salesBillId = salesBillId;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getServiceChagre() {
		return this.serviceChagre;
	}

	public void setServiceChagre(double serviceChagre) {
		this.serviceChagre = serviceChagre;
	}

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalTax() {
		return this.totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public List<SalesBillDetail> getSalesBillDetails() {
		return this.salesBillDetails;
	}

	public void setSalesBillDetails(List<SalesBillDetail> salesBillDetails) {
		this.salesBillDetails = salesBillDetails;
	}

	public SalesBillDetail addSalesBillDetail(SalesBillDetail salesBillDetail) {
		getSalesBillDetails().add(salesBillDetail);
		salesBillDetail.setSalesBill(this);

		return salesBillDetail;
	}

	public SalesBillDetail removeSalesBillDetail(SalesBillDetail salesBillDetail) {
		getSalesBillDetails().remove(salesBillDetail);
		salesBillDetail.setSalesBill(null);

		return salesBillDetail;
	}

}