/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import br.com.cwi.crescer.aula03.entity.Client;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan-David
 */
public class ClientDAO implements IDaoExercicio<Client>  {
    private EntityManager entity;

    public ClientDAO(EntityManager entity) {
        this.entity = entity;
    }

    @Override
    public void insert(Client client) {
        entity.getTransaction().begin();
        try{
            entity.persist(client);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Client client) {
        entity.getTransaction().begin();
        try{
            entity.remove(client);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void update(Client client) {
        entity.getTransaction().begin();
        try{
            entity.merge(client);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public List<Client> findAll() {
        return entity.createQuery("Select c from Client c").getResultList();
    }
}
