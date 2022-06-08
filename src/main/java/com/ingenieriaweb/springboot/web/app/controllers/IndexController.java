package com.ingenieriaweb.springboot.web.app.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ingenieriaweb.springboot.web.app.models.service.IServicio;

//import com.ingenieriaweb.springboot.web.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	//Inyeccion de dependencias basadas en campos, principio de Hollywood
//	@Autowired
//	private MiServicio servicio;
	
	//Qualifier para diferenciar, debido a que el primario esta por defecto
	//pero en este momento quiero usar MiServicioSimple, entonces uso el Qualifier
	@Autowired
	@Qualifier("MiServicioSimple")
	private IServicio servicio;
	
//	//Esto está muy acoplado: no me llames, nosotros te vamos a llamar
//	private MiServicio servicio = new MiServicio();
	
	
	
	@RequestMapping({"","/","/index"})
	public String index(Model model) {
		model.addAttribute("objeto",servicio.operacion() );
		return "index";
	}
	
	

}
