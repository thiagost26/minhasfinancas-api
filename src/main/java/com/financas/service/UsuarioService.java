package com.financas.service;

import java.util.Optional;

import com.financas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String mail);
	
	Optional<Usuario> obterPorId(Integer id);

}
