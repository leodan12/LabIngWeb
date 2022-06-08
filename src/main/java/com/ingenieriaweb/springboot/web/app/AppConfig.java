package com.ingenieriaweb.springboot.web.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ingenieriaweb.springboot.web.app.models.domain.ItemFactura;
import com.ingenieriaweb.springboot.web.app.models.domain.Producto;
import com.ingenieriaweb.springboot.web.app.models.service.IServicio;
import com.ingenieriaweb.springboot.web.app.models.service.MiServicio;
import com.ingenieriaweb.springboot.web.app.models.service.MiServicioComplejo;
//import com.ingenieriaweb.springboot.web.app.models.service.MiServicio;

@Configuration
public class AppConfig {
	
	@Bean("MiServicioSimple")
	@Primary
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("MiServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("ItemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony",100.0);
		Producto producto2 = new Producto("Bicicleta Mmonark aro 26", 900.0);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		
		return Arrays.asList(linea1,linea2);		
	}	

}
