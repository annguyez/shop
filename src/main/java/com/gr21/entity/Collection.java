package com.gr21.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="collection")
public class Collection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int collection_id;
	String collection_name;
	String collection_image;
	String collection_description;
	
	@ManyToMany
	@JoinTable(name="collection_details",
		joinColumns = @JoinColumn(name="collection_id",referencedColumnName = "collection_id"),
		inverseJoinColumns = @JoinColumn(name="product_id",referencedColumnName = "product_id")
			)
	Set<Product> products;

	public int getCollection_id() {
		return collection_id;
	}

	public String getCollection_name() {
		return collection_name;
	}

	public String getCollection_image() {
		return collection_image;
	}

	public String getCollection_description() {
		return collection_description;
	}



	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public void setCollection_id(int collection_id) {
		this.collection_id = collection_id;
	}

	public void setCollection_name(String collection_name) {
		this.collection_name = collection_name;
	}

	public void setCollection_image(String collection_image) {
		this.collection_image = collection_image;
	}

	public void setCollection_description(String collection_description) {
		this.collection_description = collection_description;
	}


	

}
