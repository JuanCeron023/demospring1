package com.mitocode.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping(produces = "application/xml")
	public Persona saludar() {
		Persona per = new Persona();
		per.setIdPersona(1);
		per.setNombres("MitoCode");
		return per;
	}

}
