package com.ingenieriaweb.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.springboot.web.app.models.Usuario;

@Controller // importo
@RequestMapping("/app") // RUTAPRIMERNIVEL_importo, ruta de mi controlador que quiero mapear
public class IndexController {

	@GetMapping({ "/index", "/", "/home" }) // importo-ruta entre llaves de index
	public String index(Model model) {
		model.addAttribute("titulo", "INGENIERIA WEB");
		return "index";
	}

	@RequestMapping("/perfil") // ruta para perfil 2
	public String perfil(Model model) {
//		SI EN UNA CLASE LE COLOCO UN CONSTRUCTOR CON PARAMETROS , JAVA YA NO COLOCA EL CONSTRUCTOR POR DEFECTO
//		Usuario()   ----> Esto darìa error porque espera parámetros
		Usuario usuario = new Usuario();
		usuario.setNombre("USUARIO ROBERTO");
		usuario.setApellido("-ROBERTO");
		usuario.setEmail("rvaldivia@unitru.edu.pe");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios");
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario ("Marcelino", "Torres","mtorres@unitru.edu.pe"));
		usuarios.add(new Usuario ("DannyS", "Torres","mtorres@unitru.edu.pe"));
		usuarios.add(new Usuario ("LuchitoS", "Torres","mtorres@unitru.edu.pe"));
		usuarios.add(new Usuario ("LeandroS", "Torres","mtorres@unitru.edu.pe"));
		usuarios.add(new Usuario ("MachucaS", "Torres","mtorres@unitru.edu.pe"));
		return usuarios;
	}
	
	
	
}
