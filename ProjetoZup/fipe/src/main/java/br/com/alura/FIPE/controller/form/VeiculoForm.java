package br.com.alura.FIPE.controller.form;

import br.com.alura.FIPE.model.Veiculo;

public class VeiculoForm {
	private String marca;
	private String modelo;
	private String anoFabricacao;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public Veiculo converter() {
		return new Veiculo(marca, modelo, anoFabricacao);
	}
}
