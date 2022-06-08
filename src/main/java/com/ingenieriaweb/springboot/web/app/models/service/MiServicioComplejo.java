package com.ingenieriaweb.springboot.web.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//Como tenemos 2 clases que esta heredado de la clase abstracta, se pone primario para esocger cual de ellos 
//quiero utilizar.
//@Component("MiServicioComplejo")
//@Primary
public class MiServicioComplejo implements IServicio{
	
	public String operacion() {
		return "Ejecutando un proceso importante complicado";
	}

}
