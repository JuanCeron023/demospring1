package com.example.demospring01.service;
import com.example.demospring01.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    private IPersonaRepo repo;

    @Override
    public void saludar() {
        this.repo.saludar();
    }

}
