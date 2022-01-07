package com.example.demospring01.repo;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo{

    @Override
    public void saludar() {
        System.out.println("HOLA CODERS!");
    }

}
