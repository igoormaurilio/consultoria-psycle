package com.example.consultorio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.consultorio.dto.ClienteDTO;

@Service
public class ClienteServices {
	private List<ClienteDTO> cliente = new ArrayList<>();
	
	public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
		cliente.add(clienteDTO);
		return clienteDTO;
	}
	
	public List<ClienteDTO> listarClientes(){
		return cliente;
	}
	public ClienteDTO buscarClientePorId(Long id) {
        return cliente.stream()
                .filter(cliente -> cliente.getId().equals(id))
                .findFirst()
                .orElse(null);
	}

}
