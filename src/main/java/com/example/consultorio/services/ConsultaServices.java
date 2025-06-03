package com.example.consultorio.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.consultorio.entities.Consulta;
import com.example.consultorio.entities.Medico;
import com.example.consultorio.repository.ConsultaRepository;
import com.example.consultorio.repository.MedicoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ConsultaServices {
	@Autowired
	private ConsultaRepository consultaRepository;
	
	@Autowired 
	private MedicoRepository medicoRepository;
	
   
	public List<Consulta> buscarPorNomeMedico(String nomeMedico) {
        // Busca médico pelo nome (MedicoRepository)
        Medico medico = medicoRepository.findByNomeIgnoreCase(nomeMedico);
        if (medico == null) {
            return List.of();
        }
        return consultaRepository.findByMedico(medico);
    }	
    public List<Consulta> buscarPorEspecialidade(String especialidade) {
        // Busca consultas pela especialidade do médico
        return consultaRepository.findByEspecialidadeIgnoreCase(especialidade);
    }
    public List<Consulta> buscarPorData(LocalDate data) {
        LocalDateTime inicioDia = data.atStartOfDay();
        LocalDateTime fimDia = data.atTime(LocalTime.MAX);
        return consultaRepository.findByDataHoraBetween(inicioDia, fimDia);
    }
	public List<Consulta> listarConsultas() {
		   return consultaRepository.findAll();
	}
	public Consulta agendarConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);

	}
	
}
