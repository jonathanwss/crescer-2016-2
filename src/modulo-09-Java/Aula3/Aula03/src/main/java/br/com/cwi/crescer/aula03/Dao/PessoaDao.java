/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import br.com.cwi.crescer.aula03.entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author santos.jonathan
 */
public class PessoaDao implements IDao<Pessoa , Long>{
    private EntityManager entity;

    public PessoaDao(EntityManager entityFactory) {
        entity = entityFactory;
    }
    
    @Override
    public void insert(Pessoa t) {
        entity.getTransaction().begin();
        try{
            if(t.getIdPessoa() == null){
                entity.persist(t);
                entity.flush();
            }else{
                entity.merge(t);
                entity.flush();
            }
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Pessoa t) {
        entity.getTransaction().begin();
        try{
            if(t.getIdPessoa() != null){
                entity.remove(t);
                entity.flush();
            }
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public Pessoa find(Long id) {
        Pessoa p = entity.find(Pessoa.class, id);
        return p;
    }

    @Override
    public List<Pessoa> findAll() {
        List<Pessoa> p = entity.createQuery("select p from Pessoa p").getResultList();
        return p;
    }
}
