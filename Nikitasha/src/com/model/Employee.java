package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMP_ID")
	private String empId;

	@Column(name="EMP_MOBILE")
	private String empMobile;

	@Column(name="EMP_NAME")
	private String empName;

	private String password;

	@Column(name="USER_NAME")
	private String userName;

	//bi-directional many-to-one association to EmployeeRoleMapping
	@ManyToOne
	@JoinColumn(name="APPLICATION_ROLE_ID")
	private EmployeeRoleMapping employeeRoleMapping;

	//bi-directional many-to-one association to PurchaseOrder
	@OneToMany(mappedBy="employee")
	private List<PurchaseOrder> purchaseOrders;

	public Employee() {
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpMobile() {
		return this.empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public EmployeeRoleMapping getEmployeeRoleMapping() {
		return this.employeeRoleMapping;
	}

	public void setEmployeeRoleMapping(EmployeeRoleMapping employeeRoleMapping) {
		this.employeeRoleMapping = employeeRoleMapping;
	}

	public List<PurchaseOrder> getPurchaseOrders() {
		return this.purchaseOrders;
	}

	public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

	public PurchaseOrder addPurchaseOrder(PurchaseOrder purchaseOrder) {
		getPurchaseOrders().add(purchaseOrder);
		purchaseOrder.setEmployee(this);

		return purchaseOrder;
	}

	public PurchaseOrder removePurchaseOrder(PurchaseOrder purchaseOrder) {
		getPurchaseOrders().remove(purchaseOrder);
		purchaseOrder.setEmployee(null);

		return purchaseOrder;
	}

}