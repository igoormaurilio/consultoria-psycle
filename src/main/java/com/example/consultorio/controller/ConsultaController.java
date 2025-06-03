package com.example.consultorio.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consultorio.entities.Consulta;
import com.example.consultorio.services.ConsultaServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
	
	@Autowired
	private ConsultaServices consultaServices;
	
    @PostMapping
    public ResponseEntity<Consulta> agendarConsulta(@Valid @RequestBody Consulta consulta) {
        
    	//recebe o objeto consulta no corpo da requisição, válida os dados e salva via service
        Consulta novaConsulta = consultaServices.agendarConsulta(consulta);
        return ResponseEntity.ok(novaConsulta);
    }
    
    @GetMapping
    public ResponseEntity<List<Consulta>> listarConsultas() {
        List<Consulta> consultas = consultaServices.listarConsultas(); // Busca todas as consultas
        return ResponseEntity.ok(consultas); 
    }

    @GetMapping("/medico/{nomeMedico}")
    public ResponseEntity<List<Consulta>> buscarPorNomeMedico(@PathVariable String nomeMedico) {
        //busca o nome do médico da URL e busca consultas
        List<Consulta> consultas = consultaServices.buscarPorNomeMedico(nomeMedico);
        return ResponseEntity.ok(consultas); 
    }
    
    @GetMapping("/especialidade/{especialidade}")
    public ResponseEntity<List<Consulta>> buscarPorEspecialidade(@PathVariable String especialidade) {
        List<Consulta> consultas = consultaServices.buscarPorEspecialidade(especialidade);
        return ResponseEntity.ok(consultas); 
    }
    
    @GetMapping("/data/{data}")
    public ResponseEntity<List<Consulta>> buscarPorData(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        //a data é recebida na URL no formato ISO (2025-06-03) e convertida para LocalDate
        List<Consulta> consultas = consultaServices.buscarPorData(data);
        return ResponseEntity.ok(consultas); 
    }



}
