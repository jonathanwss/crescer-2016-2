/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03;

import br.com.cwi.crescer.aula03.Dao.PessoaDao;
import br.com.cwi.crescer.aula03.entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author santos.jonathan
 */
public class Run {

    public static void main(String[] args) {
        /*final EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("CRESCER");
        final EntityManager em;
        em = emf.createEntityManager();

        if (em.isOpen()) {
            em.getTransaction().begin();
            try {
                Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(2l);
                pessoa.setNmPessoa("David");
                System.out.println("Ok");

                em.persist(pessoa);
                em.flush();
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
            }
            Pessoa p = em.find(Pessoa.class, 1l);
            System.out.println(p.getNmPessoa());
        }

        em.close();
        emf.close();*/
        EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("CRESCER");
        EntityManager em = entityFactory.createEntityManager();
        PessoaDao pessoaDao = new PessoaDao(em);
        Pessoa p = new Pessoa();
        Pessoa pa = new Pessoa();
        //p.setIdPessoa(3l);
        p.setNmPessoa("Eu");
        pa.setNmPessoa("Ele");
        pessoaDao.insert(p);
        pessoaDao.insert(pa);
        
        List<Pessoa> pessoas = pessoaDao.findAll();
        pessoas.forEach((pes) -> {
            System.out.println(pes.getNmPessoa());
        });
        
        em.close();
        entityFactory.close();
    }
}
