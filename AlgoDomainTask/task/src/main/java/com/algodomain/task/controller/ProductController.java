package com.algodomain.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.task.entity.Charges;
import com.algodomain.task.entity.Product;
import com.algodomain.task.service.ChargeService;
import com.algodomain.task.service.ProductService;

@RestController
public class ProductController implements ParentInterface
{
	@Autowired
	private ProductService service;
	
	@Autowired
	private ChargeService chargeService;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		product.setCharge(this.chargeService.setCharges(product));
		
		double finalPrice = (double)chargeLinkedHashMap.get("finalPrice");
		product.setFinalPrice(finalPrice);
		
		return service.saveProduct(product);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts()
	{
		return service.getProducts();
	}
	
	@GetMapping("/productById/{id}")
	public Product findProductById(@PathVariable int id)
	{
		return service.getProductById(id);
	}
	
	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable String name)
	{
		return service.getProductByName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}
}
