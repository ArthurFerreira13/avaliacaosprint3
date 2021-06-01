package com.compasso.avaliacao.controller;

import java.util.List;
import javax.transaction.Transactional;
import com.compasso.avaliacao.model.carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.compasso.avaliacao.repository.carroRepositorio;

@RestController
public class controle {
	@Autowired
	private carroRepositorio carroRepositorio;

	@RequestMapping("/carro")
	@GetMapping
	public List<carro> lista() {

		return carroRepositorio.findAll();

	}
	@GetMapping (params = "chassi")
	public ResponseEntity<List<carro>> filtraPorchassi(@RequestParam String chassi) {
		return new ResponseEntity<List<carro>>(carroRepositorio.findBychassi(chassi), HttpStatus.OK);
	}
	@GetMapping(params = "modelo" )
	public ResponseEntity<List<carro>> filtraPormodelo(@RequestParam String modelo) {
		return new ResponseEntity<List<carro>>(carroRepositorio.findBymodelo(modelo), HttpStatus.OK);
	}
	@GetMapping(params = "ano")
	public ResponseEntity<List<carro>> filtraPorano(@RequestParam double ano) {
		return new ResponseEntity<List<carro>>(carroRepositorio.findByano(ano), HttpStatus.OK);
	}
	@GetMapping(params = "valor")
public ResponseEntity<List<carro>> filtraPorvalor(@RequestParam double valor) {
	return new ResponseEntity<List<carro>>(carroRepositorio.findByvalor(valor),HttpStatus.OK);
}

	@PostMapping
	@Transactional
	
	public ResponseEntity<carro> Salvar(
			@RequestParam String chassi,
			@RequestParam String nome, 
			@RequestParam String modelo,
			@RequestParam double valor,
			@RequestParam double ano ) {
		carro car = new carro( chassi, modelo,ano,valor,nome);
		carroRepositorio.save(car);
		return null ;
	}
	}
