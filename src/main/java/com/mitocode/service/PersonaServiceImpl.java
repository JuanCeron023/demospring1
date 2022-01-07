package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.repo.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void saludar() {
		this.repo.saludar();		
	}

}
