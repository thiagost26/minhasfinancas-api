package com.financas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	boolean existsByEmail(String email);
	
	Optional<Usuario> findByEmail(String email);
}
