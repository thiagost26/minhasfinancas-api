package com.financas.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import lombok.Data;


@Entity
@Data
@Table(name = "lancamento", schema = "financas")
public class Lancamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "lan_descricao")
	private String descricao;
	
	@Column(name = "lan_mes")
	private Integer mes;
	
	@Column(name = "lan_ano")
	private Integer ano;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column(name = "lan_valor")
	private BigDecimal valor;
	
	@Column(name = "lan_data_cadastro")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate dataCadastro;
	
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "lan_tipo")
	private TipoLancamento tipo;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "lan_status")
	private StatusLancamento status;

}
