package com.springboot.mysql.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


		@RestController
		public class SnacksController {
			@RequestMapping("/get/snacks")
			public String welcome()
			{
		return "cake go and enjy";
		}
		

	}

