package br.ufg.inf.fs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufg.inf.fs.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	public Usuario findByLogin(String login);
}
