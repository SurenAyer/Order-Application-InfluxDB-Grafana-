package com.mindtree.order_application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int subCategoryId;
	private String subCategoryName;
	
	@ManyToOne
	private Category category;
	
}
