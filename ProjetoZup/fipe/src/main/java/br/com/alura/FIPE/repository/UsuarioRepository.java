package br.com.alura.FIPE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.FIPE.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{


}
