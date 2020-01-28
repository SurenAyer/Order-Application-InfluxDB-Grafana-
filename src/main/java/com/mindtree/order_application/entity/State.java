package com.mindtree.order_application.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stateId;
	private String stateName;

	@ManyToOne
	private Region region;

	@OneToMany(mappedBy="state")
	private List<City> cities; 
}
