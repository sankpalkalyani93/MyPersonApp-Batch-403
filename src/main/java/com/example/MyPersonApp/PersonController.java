package com.example.MyPersonApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	Person person = new Person("name here", 0);
	
	@GetMapping("/person")
	public Person displayPerson() {
		//Person p = new Person("Kalyani Akash Dinde", 31);
		return person;
	}
	
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person newPerson) {
		this.person = newPerson;
		return this.person;
	}
}
