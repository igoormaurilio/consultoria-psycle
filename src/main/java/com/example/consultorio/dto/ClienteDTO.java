package com.example.consultorio.dto;

import java.time.LocalDate;

import com.example.consultorio.entities.Cliente;

public class ClienteDTO {
	private Long id;
	private String nome;
	private LocalDate dataNascimento; 
	private String email;
	private String telefone;
	
	
	public ClienteDTO() {
	}


	public ClienteDTO(Long id, String nome, LocalDate dataNascimento, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	


	

	

}
