package br.com.marcosjn.cognita.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcosjn.cognita.model.Pessoa;
import br.com.marcosjn.cognita.service.PessoaService;

@RestController
public class PessoaController {
	
	private Map<Integer, Pessoa> pessoas;
	
	public PessoaController() {
		pessoas = new HashMap<Integer, Pessoa>();
		
		Pessoa pessoa = new Pessoa();
	    pessoa.setId(1);
	    pessoa.setNome("Marcos Josué Nonnenmacher");
	    pessoa.setCpf("971.374.300-82");
	    pessoa.setEmail("marcosjn@gmail.com");
	    
	    
		pessoas.put(1, pessoa);
	}
    

	@Autowired
	private PessoaService service;

	public void addPessoa(Pessoa pessoa) {
		service.addPessoa(pessoa);
	}
	
	@RequestMapping(value="/pessoas", method=RequestMethod.GET)
	public ResponseEntity<Iterable<Pessoa>> listar() {
		Iterable<Pessoa> p = service.listPessoas();
		return new ResponseEntity<Iterable<Pessoa>>(p, HttpStatus.OK);
	}
}
