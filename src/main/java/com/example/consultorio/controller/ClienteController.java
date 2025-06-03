package com.example.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consultorio.dto.ClienteDTO;
import com.example.consultorio.services.ClienteServices;

@RestController
@RequestMapping("/clientes")

public class ClienteController {

	@Autowired
    private ClienteServices clienteServices;
    @PostMapping
    public ClienteDTO cadastrarCliente(@RequestBody ClienteDTO clienteDTO) {
        return clienteServices.cadastrarCliente(clienteDTO);
    }
    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteServices.listarClientes();
    }
    @GetMapping("/{id}")
    public ClienteDTO buscarClientePorId(@PathVariable Long id) {
        return clienteServices.buscarClientePorId(id);
    }
}



