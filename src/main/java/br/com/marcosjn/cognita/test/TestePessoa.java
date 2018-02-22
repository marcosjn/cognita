package br.com.marcosjn.cognita.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.marcosjn.cognita.controller.PessoaController;
import br.com.marcosjn.cognita.model.Pessoa;
import br.com.marcosjn.cognita.service.PessoaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestePessoa {

//    @MockBean
//    private RemoteService service;

    @Autowired
    private PessoaService service;
	
	@Test
    public void addPessoa() {
    	
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);
        pessoa.setNome("Marcos Josué Nonnenmacher");
        pessoa.setCpf("971.374.300-82");
        pessoa.setEmail("marcosjn@gmail.com");

        PessoaController controller = new PessoaController();
        
        controller.addPessoa(pessoa);
        
//        EntityManager em = new JPAUtil().getEntityManager();
//        em.getTransaction().begin();
//
//        em.persist(pessoa);
//
//        pessoa = em.find(Pessoa.class, pessoa.getId());
//        em.remove(pessoa);
//
//        em.getTransaction().commit();
//        em.close();

//        EntityManager em2 = new JPAUtil().getEntityManager();
//        em2.getTransaction().begin();
//
//        pessoa.setNome("Laura Helena Hahn Nonnenmacher");
//        em2.merge(pessoa);
//
//        em2.getTransaction().commit();
//        em2.close();
    }	
}
