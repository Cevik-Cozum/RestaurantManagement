package com.example.Management.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name= "meal" )
public class Meal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "meal_name")
	private String meal_name;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "stock")
	private int stock;
	
	@OneToMany(mappedBy="meal")
	private List<Orders> orders;
	
 
	
	public Meal() {
		super();
	}
	
	public Meal(String meal_name,int price,int stock) {
		super();
		this.meal_name = meal_name;
		this.price = price;
		this.stock = stock;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMeal_name() {
		return meal_name;
	}
	public void setMeal_name(String meal_name) {
		this.meal_name = meal_name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
}
