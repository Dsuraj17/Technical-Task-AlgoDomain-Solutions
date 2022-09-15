package com.algodomain.task.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Product 
{
	@Id
	private int productId;
	private String name;
	private String productType;
	private String category;
	private double basePrice;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Charges charge;

	private double finalPrice;
	
	public Product() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String name, String productType, String category, double basePrice, double finalPrice,
			Charges charge) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
		this.finalPrice = finalPrice;
		this.charge = charge;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Charges getCharge() {
		return charge;
	}

	public void setCharge(Charges charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", productType=" + productType + ", category="
				+ category + ", basePrice=" + basePrice + ", finalPrice=" + finalPrice + ", charge=" + charge
				+ ", getProductId()=" + getProductId() + ", getName()=" + getName() + ", getProductType()="
				+ getProductType() + ", getCategory()=" + getCategory() + ", getBasePrice()=" + getBasePrice()
				+ ", getFinalPrice()=" + getFinalPrice() + ", getCharge()=" + getCharge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
