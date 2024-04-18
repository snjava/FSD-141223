package com.institute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "prod_details")
public class Product {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int pid;
	@Column(name = "prod_name")
	private String name;
	@Column(name = "prod_price")
	private double price;
	@Column(name = "prod_rating")
	private double rating;
	@Column(name = "prod_qty")
	private int quantity;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
