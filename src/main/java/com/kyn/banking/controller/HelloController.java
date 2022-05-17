package com.kyn.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class HelloController{

		@GetMapping("/getRecords")
		public String index() {
			return "Greetings from Spring Boot Application by Suresh!";
		}

	}

