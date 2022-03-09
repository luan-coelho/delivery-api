package com.study.delivery.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.study.delivery.api.model.Client;
import com.study.delivery.api.repository.ClientRepository;

@RestController
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/clients")
	public List <Client> findAll(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/clients/{name}")
	public List <Client> findByName(@PathVariable String name){
		return clientRepository.findByNameContaining(name);
	}
}
