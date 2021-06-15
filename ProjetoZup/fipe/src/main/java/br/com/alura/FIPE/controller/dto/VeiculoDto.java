package br.com.alura.FIPE.controller.dto;

import br.com.alura.FIPE.model.Veiculo;

public class VeiculoDto {
	private Long id;
	private String marca;
	private String modelo;
	private String anoFabricacao;
	public VeiculoDto(Veiculo veiculo) {
		super();
		this.id = veiculo.getId();
		this.marca = veiculo.getMarca();
		this.modelo = veiculo.getModelo();
		this.anoFabricacao = veiculo.getAnoFabricacao();
	}
	public Long getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	
	
}
