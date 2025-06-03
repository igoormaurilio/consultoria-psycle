package com.example.consultorio.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.consultorio.entities.Consulta;
import com.example.consultorio.entities.Medico;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
	boolean existsByDataHora(LocalDateTime dataHora);
	
	List<Consulta> findByMedico(Medico medico);
    
	List<Consulta> findByEspecialidadeIgnoreCase(String especialidade);
    
	List<Consulta> findByDataHoraBetween(LocalDateTime start, LocalDateTime end);

}
