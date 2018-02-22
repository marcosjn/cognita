package br.com.marcosjn.cognita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcosjn.cognita.model.Pessoa;
import br.com.marcosjn.cognita.repository.PessoaRepository;

@Service
public class PessoaService {
	
    @Autowired
    PessoaRepository repository;
    
    public void addPessoa(Pessoa pessoa) {
    	repository.save(pessoa);
    }
    
    public Iterable<Pessoa> listPessoas() {
    	return repository.findAll();
    }
}
