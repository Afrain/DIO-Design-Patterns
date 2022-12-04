package com.edu.DesignPatterns.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.DesignPatterns.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

	Optional<Endereco> findByCep(String cep);
	
}
