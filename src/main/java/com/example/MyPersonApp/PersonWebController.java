package com.example.MyPersonApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonWebController {

	@GetMapping("/person-form")
	public String getPerson() {
		return "person";
	}
}
