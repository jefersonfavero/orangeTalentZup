package br.com.alura.FIPE.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.FIPE.controller.dto.DetalhesDoVeiculoDto;
import br.com.alura.FIPE.controller.dto.UsuarioDto;
import br.com.alura.FIPE.controller.dto.VeiculoDto;
import br.com.alura.FIPE.controller.form.UsuarioForm;
import br.com.alura.FIPE.controller.form.VeiculoForm;
import br.com.alura.FIPE.model.Usuario;
import br.com.alura.FIPE.model.Veiculo;
import br.com.alura.FIPE.repository.UsuarioRepository;
import br.com.alura.FIPE.repository.VeiculoRepository;
import br.com.alura.FIPE.service.FipeService;

@RestController

public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private VeiculoRepository veiculoRepository; 
	
	@Autowired
	private FipeService fipeService;
	
	@PostMapping
	@Transactional
	@RequestMapping("/usuario")
	public ResponseEntity<UsuarioDto> cadastroUsuario(@RequestBody UsuarioForm usuarioForm, UriComponentsBuilder uriBuilder) {
		Usuario usuario = usuarioForm.converter();
		//usuarioRepository.findByCpfOrEmail(String usuario.getCpf(), String usuario.getEmail());
		usuarioRepository.save(usuario);
		URI uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();
		return ResponseEntity.created(uri).body(new UsuarioDto(usuario));
	}
	
	@PostMapping
	@Transactional
	@RequestMapping("/veiculo")
	public ResponseEntity<VeiculoDto> cadastroVeiculo(@RequestBody VeiculoForm veiculoForm, UriComponentsBuilder uriBuilder) {
		Veiculo veiculo = fipeService.buscaPrecoMedio(veiculoForm.getMarca(), veiculoForm.getModelo(), veiculoForm.getAnoFabricacao());
		//Veiculo veiculo = veiculoForm.converter();
		veiculoRepository.save(veiculo);
		
		URI uri = uriBuilder.path("/veiculo/{id}").buildAndExpand(veiculo.getId()).toUri();
		return ResponseEntity.created(uri).body(new VeiculoDto(veiculo));
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<DetalhesDoVeiculoDto> listarVeiculo(@PathVariable Long id) {
		Optional<Veiculo> veiculo = veiculoRepository.findById(id);
		if (veiculo.isPresent()) {
			return ResponseEntity.ok(new DetalhesDoVeiculoDto(veiculo.get()));
		}
		
		return ResponseEntity.notFound().build();
	}
	
}
