package com.tiket.db.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name = "product")
@Table(name = "products")
public class Product {

	@GeneratedValue
	@Id
	@Column(name = "productid")
	Integer productId;
	
	@Column(name = "productname")
	String productName;

	@Column(name = "unitprice")
	Integer unitPrice;

	@Column(name = "instock")
	Integer inStock;

	
	@OneToOne
	@JoinColumn(name = "ProductID")
	private OrderDetail orderDetail;
    
    public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getInStock() {
		return inStock;
	}

	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}

	
}

