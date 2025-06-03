package com.example.consultorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.consultorio.entities.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
	
	//vai verificar se há um medico com o determinado CRM
	boolean existsByCrm(String crm);
	
	//buscar o med por email
	Medico findByEmail(String email);

	Medico findByNomeIgnoreCase(String nomeMedico);

	

}
