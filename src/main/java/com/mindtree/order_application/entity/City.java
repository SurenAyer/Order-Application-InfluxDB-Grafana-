package com.mindtree.order_application.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cityId;
	private String cityName;

	@ManyToOne
	private State state;
	
	@OneToMany(mappedBy="city")
	private List<PostalCode> postalCodes;
}
