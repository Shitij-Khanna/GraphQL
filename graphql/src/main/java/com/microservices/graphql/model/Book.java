package com.microservices.graphql.model;

public class Book {

	private int id;
	
	private String title;
	
	private int pages;
	
	Author author;

	public Book(int id, String title, int pages, Author author) {
		this.id = id;
		this.title = title;
		this.pages = pages;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
