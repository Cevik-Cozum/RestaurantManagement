package com.example.Management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="meal_id",insertable=false,updatable=false)
	private Meal meal;
	
	private int meal_id;
	
	@ManyToOne
	@JoinColumn(name="customer_id",insertable=false,updatable=false)
	private Customer customer;
	
	private int customer_id;
	
	
	public Orders() {
		
	}
	
	public Orders(int id, int meal_id, int customer_id) {
		super();
		this.id = id;
		this.meal_id = meal_id;
		this.customer_id = customer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMeal_id() {
		return meal_id;
	}

	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	
	
	
}
