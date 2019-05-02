package com.tiket.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shipping_methods")
public class ShippingMethod {

	@GeneratedValue
	@Id
	@Column(name = "shippingmethodID")
	Integer shippingMethodID;
	
	@Column(name = "shippingmethod")
	String shippingMethod;
	
	@OneToOne
	@JoinColumn(name = "shippingmethodID")
	private Order order;
	

	
	public Integer getShippingMethodID() {
		return shippingMethodID;
	}
	public void setShippingMethodID(Integer shippingMethodID) {
		this.shippingMethodID = shippingMethodID;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	
	
}

