package com.atik.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "atik", "Learn to Be A Great Lover", new Date(), false));
		todos.add(new Todo(++idCounter, "atik", "Become An Expert At Java Spring Boot & Angular", new Date(), false));
		todos.add(new Todo(++idCounter, "atik", "Visit Bangladesh", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}

}
