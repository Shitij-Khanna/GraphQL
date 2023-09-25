package com.microservices.graphql.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.microservices.graphql.model.Author;
import com.microservices.graphql.model.Book;

@Component
public class BookRepository {

	
	private static List<Book> books = new ArrayList<Book>();

	public List<Book> allBooks() {
		Book book1 = new Book(1, "GraphQL Overview", 100, new Author("Amit"));
		Book book2 = new Book(2, "Spring Overview", 100, new Author("Lokesh"));
		books.add(book1);
		books.add(book2);
		return books;
	}

	public Book bookById(Integer id) {
		for (Book book : books) {
			if (book.getId() == id)
				return book;
		}
		return null;
	}

	public Book updateBook(Integer id, String title) {
		Book book = bookById(id);
		if (book != null) {
			book.setTitle(title);
		}
		return book;
	}
}
