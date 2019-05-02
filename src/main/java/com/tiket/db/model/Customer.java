package com.tiket.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "customerID")
	Integer customerID;
	
	@Column(name = "firstname")
	String firstName;
	
	@Column(name = "lastname")
	String lastName;
	
	@Column(name = "billingaddress")
	String billingAddress;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "stateorprovince")
	String stateOrProvince;
	
	@Column(name = "zipcode")
	String zipCode;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "companywebsite")
	String companyWebsite;
	
	@Column(name = "phonenumber")
	String phoneNumber;
	
	@Column(name = "faxnumber")
	String faxNumber;
	
	@Column(name = "shipaddress")
	String shipAddress;
	
	@Column(name = "shipcity")
	String shipCity;
	
	@Column(name = "shipstateorprovince")
	String shipStateOrProvince;
	
	@Column(name = "shipzipcode")
	String shipZipCode;
	
	@Column(name = "shipphonenumber")
	String shipPhoneNumber;
	
    @OneToOne
    @JoinColumn(name="CustomerID")
    private Order order;
    
	public Integer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateOrProvince() {
		return stateOrProvince;
	}
	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	public String getShipStateOrProvince() {
		return shipStateOrProvince;
	}
	public void setShipStateOrProvince(String shipStateOrProvince) {
		this.shipStateOrProvince = shipStateOrProvince;
	}
	public String getShipZipCode() {
		return shipZipCode;
	}
	public void setShipZipCode(String shipZipCode) {
		this.shipZipCode = shipZipCode;
	}
	public String getShipPhoneNumber() {
		return shipPhoneNumber;
	}
	public void setShipPhoneNumber(String shipPhoneNumber) {
		this.shipPhoneNumber = shipPhoneNumber;
	}
	
}

