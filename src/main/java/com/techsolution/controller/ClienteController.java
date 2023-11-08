package com.techsolution.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsolution.entity.Cliente;
import com.techsolution.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	
	
	private final ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		this.clienteService=clienteService;
	}
	
	@GetMapping("/ver")
	public ResponseEntity<?> findAll(){
		Map<String, Object> message =  new HashMap<>();
		List<Cliente> clientes = clienteService.findAll();
		if(clientes==null || clientes.isEmpty()) {
			message.put("menssaje", "No hay registros de clientes en nuestra base de datos");
			return new ResponseEntity<Map<String, Object>>(message,HttpStatusCode.valueOf(200));
		}else {
			return new ResponseEntity<List<Cliente>>(clientes,HttpStatusCode.valueOf(200));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}