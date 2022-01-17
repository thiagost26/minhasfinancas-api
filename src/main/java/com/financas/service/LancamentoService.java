package com.financas.service;

import java.util.List;

import com.financas.model.entity.Lancamento;
import com.financas.model.entity.StatusLancamento;

public interface LancamentoService {
	
	Lancamento salvar(Lancamento lancamento);
	
	Lancamento atualizar(Lancamento lancamento);
	
	void deletar(Lancamento lancamento);
	
	List<Lancamento> buscar(Lancamento lancamento);
	
	void atualizarLancamento(Lancamento lancamento, StatusLancamento status);
	
	void validar(Lancamento lancamento);
	

}
