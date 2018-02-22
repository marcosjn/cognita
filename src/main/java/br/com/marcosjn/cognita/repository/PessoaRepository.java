package br.com.marcosjn.cognita.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.marcosjn.cognita.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}
