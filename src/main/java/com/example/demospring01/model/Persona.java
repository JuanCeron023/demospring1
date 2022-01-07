package com.example.demospring01.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {

    private Integer idPersona;
    private String nombres;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

}
