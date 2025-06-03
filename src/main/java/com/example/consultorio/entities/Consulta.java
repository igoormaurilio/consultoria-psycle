package com.example.consultorio.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime dataHora;
	private String observacao;
	private String especialidade;
	
	
	 @ManyToOne
	@JoinColumn(name = "cliente_id") 
	    private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "medico_id")
	private Medico medico;

	
	public Consulta() {
	}

	public Consulta(Long id, Cliente clienteid, LocalDateTime dataHora, String observacao) {
		this.id = id;
		this.cliente = cliente;
		this.dataHora = dataHora;
		this.observacao = observacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente clienteid) {
		this.cliente = clienteid;
	}

	public LocalDateTime getDatahora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
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
