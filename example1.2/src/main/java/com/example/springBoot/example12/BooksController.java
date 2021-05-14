package com.example.springBoot.example12;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Books> getAllBooks(){
		
		return Arrays.asList(new Books(12,"The Strangers 1.0","Naman Kapoor"));
		
	}
	
}
