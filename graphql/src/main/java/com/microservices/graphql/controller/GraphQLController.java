package com.microservices.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.graphql.model.Book;
import com.microservices.graphql.repository.BookRepository;

@RestController
public class GraphQLController {

	@Autowired
	BookRepository bookRepository;

	@SchemaMapping(typeName = "Query", value = "allBooks")
	public List<Book> getAllBooks() {
		return bookRepository.allBooks();
	}

	@QueryMapping
	public String helloWorld() {
		return "Test Graph ql with controller";
	}

}
