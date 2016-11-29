/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import br.com.cwi.crescer.aula03.entity.Cotacao;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan-David
 */
public class CotacaoDAO implements IDaoExercicio<Cotacao> {
    private EntityManager entity;
    
    public CotacaoDAO(EntityManager entity){
        this.entity = entity;
    }
    
    @Override
    public void insert(Cotacao cotacao) {
        entity.getTransaction().begin();
        try{
            entity.persist(cotacao);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Cotacao cotacao) {
        entity.getTransaction().begin();
        try{
            entity.remove(cotacao);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void update(Cotacao cotacao) {
        entity.getTransaction().begin();
        try{
            entity.merge(cotacao);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public List<Cotacao> findAll() {
        return entity.createQuery("select c from Cotacao c").getResultList();
    }
    
}
