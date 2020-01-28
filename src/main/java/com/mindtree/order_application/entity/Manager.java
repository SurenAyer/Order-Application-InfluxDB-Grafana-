package com.mindtree.order_application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Manager {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int managerId;
	private String managerName;
	
	@OneToOne(mappedBy="manager")
	private Region region;
	

}
