package com.tiket.db.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name= "orders")
public class Order {

	@Id
    @GeneratedValue
    @Column(name = "OrderID")
	Integer orderID;
	
    @Column(name = "CustomerID")
	Integer customerID;
    
    @Column(name = "EmployeeID")
	Integer employeeID;
    
    @Column(name = "orderdate")
	Date orderDate;
    
    @Column(name = "purchaseordernumber")
	String purchaseOrderNumber;
    
    @Column(name = "shipdate")
	Date shipDate;
    
    @Column(name = "shippingmethodID")
	Integer shippingMethodID;
    
    @Column(name = "freightcharge")
	Integer freightCharge;
    
    @Column(name = "taxes")
	Integer taxes;
    
    @Column(name = "paymentreceived")
	String paymentReceived;
    
    @Column(name = "comment")
	String comment;

    
    @OneToOne(mappedBy="order")
    private Employee employee;
    
    @OneToOne(mappedBy="order")
    private Customer customer;
    
    @OneToOne(mappedBy="order")
    private ShippingMethod shippingMethod;
    
    @OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderid")
	private Set<OrderDetail> orderDetails;
    
	public ShippingMethod getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(ShippingMethod shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Order() {

	}
	
	public Order(Integer orderID, Integer customerID, Integer employeeID, Date orderDate, String purchaseOrderNumber,
			Date shipDate, Integer shippingMethodID, Integer freightCharge, Integer taxes, String paymentReceived,
			String comment) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
		this.employeeID = employeeID;
		this.orderDate = orderDate;
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.shipDate = shipDate;
		this.shippingMethodID = shippingMethodID;
		this.freightCharge = freightCharge;
		this.taxes = taxes;
		this.paymentReceived = paymentReceived;
		this.comment = comment;
//		this.employee = employee;
//		this.shippingMethod = shippingMethod;
//		this.orderDetails = orderDetails;
	}
	
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	public Integer getShippingMethodID() {
		return shippingMethodID;
	}
	public void setShippingMethodID(Integer shippingMethodID) {
		this.shippingMethodID = shippingMethodID;
	}
	public Integer getFreightCharge() {
		return freightCharge;
	}
	public void setFreightCharge(Integer freightCharge) {
		this.freightCharge = freightCharge;
	}
	public Integer getTaxes() {
		return taxes;
	}
	public void setTaxes(Integer taxes) {
		this.taxes = taxes;
	}
	public String getPaymentReceived() {
		return paymentReceived;
	}
	public void setPaymentReceived(String paymentReceived) {
		this.paymentReceived = paymentReceived;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}

