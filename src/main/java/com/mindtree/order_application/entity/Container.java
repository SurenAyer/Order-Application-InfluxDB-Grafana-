package com.mindtree.order_application.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Container {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int containerId;
	private String containerName;

	@OneToMany(mappedBy="container")
	private List<Product> products;
}
