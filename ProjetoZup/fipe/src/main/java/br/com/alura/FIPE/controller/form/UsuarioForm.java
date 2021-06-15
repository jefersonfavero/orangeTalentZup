package br.com.alura.FIPE.controller.form;

import br.com.alura.FIPE.model.Usuario;
import br.com.alura.FIPE.model.Veiculo;

public class UsuarioForm {
	
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;
	private Veiculo veiculo;
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Usuario converter() {
		return new Usuario(nome, email, cpf, dataNascimento, veiculo);
	}
	
	
}
