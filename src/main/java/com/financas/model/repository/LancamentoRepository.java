package com.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Integer> {
	

}
