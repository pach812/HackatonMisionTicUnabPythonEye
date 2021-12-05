package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Usuario;
import com.ejemplo.tiendaalamano.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario Usuario) {
		return usuarioRepository.save(Usuario);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		usuarioRepository.deleteById(id);
	}

	@Override
	public Usuario login(String username, String password) {
		return new Usuario();
	}

}
