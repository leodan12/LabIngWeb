package com.ingenieriaweb.springboot.form.app.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class FormController {

	@GetMapping("/form")
	public String from(Model model) {
		return "form";
	}

}
