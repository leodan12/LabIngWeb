package com.ingenieriaweb.springboot.web.app.models.service;

import org.springframework.stereotype.Component;


//Component se encarga de crear los objetos con el constructor sin parámetros

@Component("MiServicioSimple")
public class MiServicio implements IServicio{
		
	public String operacion() {
		return "ejecutando algun proceso importante";
	}
	
	
	

}
