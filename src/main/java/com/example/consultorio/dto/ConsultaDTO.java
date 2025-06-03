package com.example.consultorio.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.consultorio.entities.Consulta;


public class ConsultaDTO {
	private Long id;
	private Long clienteid;
	private LocalDateTime datahora;
	private String observacao;
	private String especialidade;
	
	
	
	public ConsultaDTO(Consulta entity) {
		this.id = entity.getId();
		this.clienteid = entity.getCliente().getId();
		this.datahora = datahora;
		this.observacao = observacao;
		this.especialidade = especialidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClienteid() {
		return clienteid;
	}

	public void setClienteid(Long clienteid) {
		this.clienteid = clienteid;
	}

	public LocalDateTime getDatahora() {
		return datahora;
	}

	public void setDatahora(LocalDateTime datahora) {
		this.datahora = datahora;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
