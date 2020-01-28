package com.mindtree.order_application.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Region {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int regionId;
	private String regionName;

	@OneToOne
	private Manager manager;
	@OneToMany(mappedBy="region")
	private List<State> states;
	
}
