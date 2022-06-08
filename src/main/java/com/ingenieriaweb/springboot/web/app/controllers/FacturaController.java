package com.ingenieriaweb.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.springboot.web.app.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {
	
	
	//Inyectamos a factura, se crea un objeto de tipo Factura, entonces factura ya tendra
	//el nombre cliente , etc. Porque el Autowired ya lo inyecta
	@Autowired
	private Factura factura;
	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("factura",factura);
		model.addAttribute("titulo","Ejemplo de inyeccion de dependencias");
		return "factura/ver";
	}
}
