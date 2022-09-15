package com.algodomain.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.task.controller.ParentInterface;
import com.algodomain.task.entity.Charges;
import com.algodomain.task.entity.Product;
import com.algodomain.task.repository.ChargeRepository;

@Service
public class ChargeService implements ParentInterface
{
	@Autowired
	private ChargeRepository repository;

	public Charges setCharges(Product product)
	{
		Charges charge = new Charges();
		
		double discount=0.0;
		double gst=0.0;
		double delivery=0.0;
		double finalPrice=0.0;
		
		if((product.getCategory()).equalsIgnoreCase("ELECTRONICS"))
		{
			discount = ((product.getBasePrice())*(0.15));
			gst = ((product.getBasePrice()-(discount))*(0.18)); 
			delivery=350.00;
			finalPrice=((product.getBasePrice()-(discount))+(gst)+(delivery));
			
			chargeLinkedHashMap.put("finalPrice", finalPrice);
		}
		else if((product.getCategory()).equalsIgnoreCase("HOME APPLIANCES"))
		{
			discount = ((product.getBasePrice())*(0.22));
			gst = ((product.getBasePrice()-(discount))*(0.24)); 
			delivery=800.00;
			finalPrice=((product.getBasePrice()-(discount))+(gst)+(delivery));
			
			chargeLinkedHashMap.put("finalPrice", finalPrice);
		}
		else if((product.getCategory()).equalsIgnoreCase("CLOTHING"))
		{
			discount = ((product.getBasePrice())*(0.40));
			gst = ((product.getBasePrice()-(discount))*(0.12)); 
			delivery=00.00;
			finalPrice=((product.getBasePrice()-(discount))+(gst)+(delivery));
			
			chargeLinkedHashMap.put("finalPrice", finalPrice);
		}
		else if((product.getCategory()).equalsIgnoreCase("FURNITURE"))
		{
			discount = ((product.getBasePrice())*(0.10));
			gst = ((product.getBasePrice()-(discount))*(0.18)); 
			delivery=300.00;
			finalPrice=((product.getBasePrice()-(discount))+(gst)+(delivery));
			
			chargeLinkedHashMap.put("finalPrice", finalPrice);
		}
		
		charge.setDiscount(discount);
		charge.setGst(gst);
		charge.setDelivery(delivery);
		
		this.repository.save(charge);
		
		return charge;
	}
	
	public Charges updateCharges(Product product)
	{
		Charges charge = this.repository.findById(product.getCharge().getId()).get();
		
		double discount=0.0;
		double gst=0.0;
		double delivery=0.0;
		double finalPrice=0.0;
		
		if((product.getCategory()).equalsIgnoreCase("ELECTRONICS"))
		{
			discount = ((product.getBasePrice())*(0.15));
			gst = ((product.getBasePrice()-(discount))*(0.18)); 
			delivery=350.00;
			finalPrice=((product.getBasePrice()-(discount))+(gst)+(delivery));
			
			chargeLinkedHashMap.put("finalPrice", finalPrice);
		}
		else if((product.getCategory()).equalsIgnoreCase("HOME APPLIANCES"))
		{
			discount = ((product.getBasePrice())*(0.22));
			gst = ((product.getBasePrice()-(discount))*(0.24)); 
			delivery=800.00;
			finalPrice=((product.getBasePrice()-(discount))+(gst)+(delivery));
			
			chargeLinkedHashMap.put("finalPrice", finalPrice);
		}
		else if((product.getCategory()).equalsIgnoreCase("CLOTHING"))
		{
			discount = ((product.getBasePrice())*(0.40));
			gst = ((product.getBasePrice()-(discount))*(0.12)); 
			delivery=00.00;
			finalPrice=((product.getBasePrice()-(discount))+(gst)+(delivery));
			
			chargeLinkedHashMap.put("finalPrice", finalPrice);
		}
		else if((product.getCategory()).equalsIgnoreCase("FURNITURE"))
		{
			discount = ((product.getBasePrice())*(0.10));
			gst = ((product.getBasePrice()-(discount))*(0.18)); 
			delivery=300.00;
			
			finalPrice=((product.getBasePrice()-(discount))+(gst)+(delivery));
			
			chargeLinkedHashMap.put("finalPrice", finalPrice);
		}
		
		charge.setDiscount(discount);
		charge.setGst(gst);
		charge.setDelivery(delivery);
		
		this.repository.save(charge);
		
		return charge;
	}
	
	public Charges deleteCharges(Product product)
	{
		Charges charge = this.repository.findById(product.getCharge().getId()).get();
		
		this.repository.delete(charge);
		return charge;
	}
	
}
