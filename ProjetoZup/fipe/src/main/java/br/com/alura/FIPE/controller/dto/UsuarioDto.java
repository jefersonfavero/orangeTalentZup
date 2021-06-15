package br.com.alura.FIPE.controller.dto;

import br.com.alura.FIPE.model.Usuario;

public class UsuarioDto {
	
	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;
	
	public UsuarioDto(Usuario usuario) {
		super();
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.cpf = usuario.getCpf();
		this.dataNascimento = usuario.getDataNascimento();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getCpf() {
		return cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	
}
