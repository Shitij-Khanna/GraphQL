package com.microservices.graphql.model;

public class Author {


	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Author(String name) {
		super();
		this.name = name;
	}

	
}
