/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import br.com.cwi.crescer.aula03.entity.Servico;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan-David
 */
public class ServicoDAO implements IDaoExercicio<Servico> {
    private EntityManager entity;
    
    public ServicoDAO(EntityManager entity){
        this.entity = entity;
    }
    
    @Override
    public void insert(Servico servico) {
        entity.getTransaction().begin();
        try{
            entity.persist(servico);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Servico servico) {
        entity.getTransaction().begin();
        try{
            entity.remove(servico);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void update(Servico servico) {
        entity.getTransaction().begin();
        try{
            entity.merge(servico);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public List<Servico> findAll() {
        return entity.createQuery("select s from Servico s").getResultList();
    }
    
}
