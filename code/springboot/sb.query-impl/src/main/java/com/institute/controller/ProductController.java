package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Product;
import com.institute.reporitory.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/create-product")
	public String saveProduct(@RequestBody Product product) {
		productRepository.save(product);
		return "Product Created Successfully..";
	}
	
	@PutMapping("/update_product_qty")
	public String updateProductQty(@RequestParam("quantity") int quantity,@RequestParam("id") int id) {
		productRepository.updateProductQuantity_HQL(quantity, id);
		return "Product Quantity Updated...";
	}
	
	@PutMapping("/update_prod_rating/{id}/{rating}")
	public String updateProdRating(@PathVariable("id") int id, @PathVariable("rating") double rating) {
		productRepository.updateProdRating_SQL(id, rating);
		return "Product Ratings Updated...";
	}
	
	@GetMapping("/get-prod-by-ratings/{rating}")
	public List<Product> getProductByRating(@PathVariable("rating") double rating) {
		return productRepository.getProdByRating(rating);
	}
	
}








