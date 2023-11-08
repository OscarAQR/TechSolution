package com.techsolution.service;

import java.util.List;
import java.util.Optional;


import com.techsolution.entity.Cliente;

public interface ClienteService {

	List<Cliente> findAll();

	Optional<Cliente> findById(long id);
	 
	Cliente save(Cliente cliente);

	String delete(Cliente cliente);
	
	
	
}
