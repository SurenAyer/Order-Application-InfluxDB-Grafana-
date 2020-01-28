package com.mindtree.order_application.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	private int customerID;
	private String customerName;
	
	@OneToMany(mappedBy="customer")
	private List<Order> orders;
	
	@ManyToOne
	private PostalCode postalCode;
	
}
