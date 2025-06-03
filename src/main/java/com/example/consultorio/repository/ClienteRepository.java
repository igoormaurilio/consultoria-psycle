package com.example.consultorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.consultorio.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

}
