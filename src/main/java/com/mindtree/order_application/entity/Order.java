package com.mindtree.order_application.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Order {

	@Id
	private int orderId;
	private Date orderDate;
	private boolean returnStatus;
	
	@ManyToOne
	private Customer customer;
	@ManyToOne
	private Priority prirority;
	
}
