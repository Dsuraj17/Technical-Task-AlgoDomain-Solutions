package com.algodomain.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.task.controller.ParentInterface;
import com.algodomain.task.entity.Product;
import com.algodomain.task.repository.ProductRepository;

@Service
public class ProductService implements ParentInterface
{
	@Autowired
	private ProductRepository repository;

	@Autowired
	private ChargeService chargeService;
	
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products)
	{
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts()
	{
		return repository.findAll(); 
	}
	
	public Product getProductById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name)
	{
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id)
	{
		repository.deleteById(id);
		return "Product Deleted !"+id;
	}
	
	public Product updateProduct(Product product)
	{
		Product existingProduct=repository.findById(product.getProductId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setProductType(product.getProductType());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setBasePrice(product.getBasePrice());
		existingProduct.setCharge(this.chargeService.updateCharges(existingProduct));

		double finalPrice = (double)chargeLinkedHashMap.get("finalPrice");
		existingProduct.setFinalPrice(finalPrice);
		
		return repository.save(existingProduct);
	}
}
