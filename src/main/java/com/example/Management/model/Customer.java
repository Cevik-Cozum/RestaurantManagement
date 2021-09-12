package com.example.Management.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Waiter.class)
	@JoinColumn(name="waiter_id",insertable=false,updatable=false)
	private Waiter waiter;
	
    @Column(name = "waiter_id", unique = true, nullable = false)
	private int waiter_id;
	
	@OneToMany(mappedBy="customer")
	private List<Orders> orders;
	
    public Customer() {
    	super();
    }
    public Customer(int id, String name, String address, int waiter_id) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.waiter_id = waiter_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getWaiter_id() {
		return waiter_id;
	}
	public void setWaiter_id(int waiter_id) {
		this.waiter_id = waiter_id;
	}
	
	
}
