package br.com.alura.FIPE.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.alura.FIPE.model.Veiculo;

@FeignClient(url = "https://parallelum.com.br/fipe/api/v1/carros/marcas", name = "fipee")
public interface FipeService {
	
	 @GetMapping("{marca}/modelos/{modelo}/anos/{anoFabricacao}")
	 public Veiculo buscaPrecoMedio(@PathVariable("marca") String marca, @PathVariable("modelo") String modelo, @PathVariable("anoFabricacao") String anoFabricacao);
}
