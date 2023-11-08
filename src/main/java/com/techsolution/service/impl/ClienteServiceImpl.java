package com.techsolution.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techsolution.entity.Cliente;
import com.techsolution.respository.ClienteRepositories;
import com.techsolution.service.ClienteService;



@Service
public class ClienteServiceImpl implements ClienteService{

	
	private final ClienteRepositories clienteRepositorio;
	
	public ClienteServiceImpl (ClienteRepositories clienteRepositorio) {
		this.clienteRepositorio =  clienteRepositorio;
	}
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		List<Cliente> clientes = (List<Cliente>) clienteRepositorio.findAll();
		if(!clientes.isEmpty()) {
			return clientes;
		}else {
			return null;
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public Optional<Cliente> findById(long id) {
		// TODO Auto-generated method stub
		Optional<Cliente> clienteOp = clienteRepositorio.findById(id);
		if(clienteOp.isPresent()) {
			return (Optional<Cliente>) Optional.of(null).get();
		}else {
			return Optional.empty();
		}
		
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente clienteInsertado = clienteRepositorio.save(cliente);
		return clienteInsertado;
	
	}

	@Override
	public String delete(Cliente cliente) {
		// TODO Auto-generated method stub
		Optional<Cliente> clienteOp= clienteRepositorio.findById(cliente.getId_cliente());
		if(clienteOp.isPresent()) {
			clienteRepositorio.deleteById(clienteOp.get().getId_cliente());
			return "Se ha eliminado correctamente";
		}else {
			return "No se puedo eliminar el registro porque no existe";
		}
		
		
	}

}
