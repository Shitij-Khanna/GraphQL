package com.microservices.graphql.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class HelloWorldQueryResolver{

	public String helloWorld() {
		return "Test GraphQL query";
	}
	
}
