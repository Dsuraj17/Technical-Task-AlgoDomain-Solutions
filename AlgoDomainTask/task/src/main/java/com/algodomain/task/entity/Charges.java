package com.algodomain.task.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Charges 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double discount;
	private double gst;
	private double delivery;
	
//	@OneToOne
//	private Product category;

    
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public double getGst() {
		return gst;
	}



	public void setGst(double gst) {
		this.gst = gst;
	}



	public double getDelivery() {
		return delivery;
	}



	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}


}
