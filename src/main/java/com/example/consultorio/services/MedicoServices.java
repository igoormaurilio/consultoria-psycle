package com.example.consultorio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.consultorio.dto.MedicoDTO;

@Service
public class MedicoServices {
	private List<MedicoDTO> medicos = new ArrayList<>();
	
	public MedicoDTO cadastrarMedico(MedicoDTO medicoDTO) {
		medicos.add(medicoDTO);
		return medicoDTO;
	}
	
	public List<MedicoDTO> listarMedicos(){
		return medicos;
	}
	public MedicoDTO buscarMedicoPorId(Long id) {
		return medicos.stream()
				.filter(medico -> medico.getId().equals(id))
				.findFirst()
				.orElse(null);
	}
	  public List<MedicoDTO> listarMedicosDisponivel() {
	        List<MedicoDTO> medicosDisponivel = new ArrayList<>();
	        for (MedicoDTO medico : medicos) {
	            if (medico.isDisponivel()) {
	                medicosDisponivel.add(medico);
	            }
	        }
	        return medicosDisponivel;
	  }
	

}
