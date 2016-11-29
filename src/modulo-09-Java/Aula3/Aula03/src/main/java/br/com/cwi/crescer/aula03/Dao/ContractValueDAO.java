/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import br.com.cwi.crescer.aula03.entity.Contract_Value;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan-David
 */
public class ContractValueDAO implements IDaoExercicio<Contract_Value> {
    private EntityManager entity;
    
    public ContractValueDAO(EntityManager entity){
        this.entity = entity;
    }
    
    @Override
    public void insert(Contract_Value contract) {
        entity.getTransaction().begin();
        try{
            entity.persist(contract);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Contract_Value contract) {
        entity.getTransaction().begin();
        try{
            entity.remove(contract);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void update(Contract_Value contract) {
        entity.getTransaction().begin();
        try{
            entity.merge(contract);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public List<Contract_Value> findAll() {
        return entity.createQuery("select c from Contract_Value c").getResultList();
    }
    
}
