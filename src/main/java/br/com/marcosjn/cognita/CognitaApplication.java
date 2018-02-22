package br.com.marcosjn.cognita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.marcosjn.cognita.controller.PessoaController;
import br.com.marcosjn.cognita.model.Pessoa;

@SpringBootApplication
public class CognitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CognitaApplication.class, args);
	}
}
