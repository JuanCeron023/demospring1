package com.example.demospring01.controller;

import com.example.demospring01.model.Persona;
import com.example.demospring01.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
