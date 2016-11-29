/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import br.com.cwi.crescer.aula03.entity.Contract;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan-David
 */
public class ContractDAO implements IDaoExercicio<Contract>{
    private EntityManager entity;

    public ContractDAO(EntityManager entity) {
        this.entity = entity;
    }

    @Override
    public void insert(Contract contract) {
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
    public void delete(Contract contract) {
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
    public void update(Contract contract) {
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
    public List<Contract> findAll() {
        return entity.createQuery("Select c from Contract c").getResultList();
    }
}
