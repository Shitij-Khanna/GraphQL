package com.microservices.graphql.model.transferobjects;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
	
	private UUID id;
	
	private String name;
	
	private String email;
	
	private List<PostDto> posts;
	
}
