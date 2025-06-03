package com.example.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consultorio.dto.MedicoDTO;
import com.example.consultorio.services.MedicoServices;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	@Autowired
	private MedicoServices medicoServices;
	
	@PostMapping
	public MedicoDTO cadastrarMedico(@RequestBody MedicoDTO medicoDTO) {
		return medicoServices.cadastrarMedico(medicoDTO);
	}
	@GetMapping
	public List<MedicoDTO> listarMedicos(){
		return medicoServices.listarMedicos();
	}
	@GetMapping("/disponivel")
	public List<MedicoDTO> listarMedicosDisponivel(){
		return medicoServices.listarMedicosDisponivel();
	}
	 @GetMapping("/{id}")
	    public MedicoDTO buscarMedicoPorId(@PathVariable Long id) {
	        return medicoServices.buscarMedicoPorId(id);
	    }
	

}
