package br.com.alura.FIPE.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.alura.FIPE.model.Veiculo;

@FeignClient(url = "https://parallelum.com.br/fipe/api/v1/", name = "fipe")
public interface ClientFipe {
	
	@GetMapping("{marca}/modelos/{modelos}/anos/{anoFabricacao}")
	public Veiculo buscaPrecoMedio(@PathVariable("marca") String marca, @PathVariable("modelo") String modelo, @PathVariable("anoFabricacao") String anoFabricacao);
	
}
