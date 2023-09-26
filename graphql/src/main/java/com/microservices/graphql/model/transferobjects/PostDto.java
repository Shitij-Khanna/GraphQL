package com.microservices.graphql.model.transferobjects;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
	
	private UUID id;
	
	private String title;
	
	private String description;
	
	private String category;
	
	private AuthorDto author;

}
