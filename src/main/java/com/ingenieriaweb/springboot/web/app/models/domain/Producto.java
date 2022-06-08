package com.ingenieriaweb.springboot.web.app.models.domain;

import org.springframework.stereotype.Component;

//No le colocamos component porque no ncesitamos inyectar
public class Producto {
	
	private String nombre;
	private Double precio;
	
	
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	
	

}
