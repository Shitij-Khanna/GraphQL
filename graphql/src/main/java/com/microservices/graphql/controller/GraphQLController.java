package com.microservices.graphql.controller;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.graphql.model.Book;
import com.microservices.graphql.model.transferobjects.AuthorDto;
import com.microservices.graphql.model.transferobjects.PostDto;
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

	@QueryMapping
	public List<AuthorDto> getAuthors() {
		return Collections.singletonList(
				AuthorDto.builder().id(UUID.randomUUID()).name("Shitij Khanna").email("khanna108@gmail.com").build());

	}

	@SchemaMapping(typeName = "Author", field = "posts")
	public List<PostDto> getPosts(AuthorDto author) {

		List<PostDto> posts = Collections.singletonList(PostDto.builder().id(UUID.randomUUID()).title("Graph ql post")
				.author(author).category("Random").description("Test post").build());

		return posts;
	}

	@SchemaMapping(typeName = "Post", field = "author")
	public AuthorDto getAuthor(PostDto post) {

		return post.getAuthor();
	}

}
