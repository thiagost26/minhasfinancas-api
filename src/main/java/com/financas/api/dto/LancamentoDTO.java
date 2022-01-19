package com.financas.api.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LancamentoDTO {

	
	private Integer id;
	private String descricao;
	private Integer mes;
	private Integer ano;
	private BigDecimal valor;
	private Integer usuario;
	private String tipo;
	private String status;
}
