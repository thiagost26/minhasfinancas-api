package com.financas.model.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario", schema = "financas")
public class Usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "usu_nome")
	private String nome;
	
	@Column(name = "usu_email")
	private String email;
	
	@Column(name = "usu_senha")
	private String senha;
	
	@Column(name = "usu_data_cadastro")
	private LocalDate dataCadastro;
	
	@PrePersist
	public void lancarData() {
		dataCadastro = LocalDate.now();
	}

}
