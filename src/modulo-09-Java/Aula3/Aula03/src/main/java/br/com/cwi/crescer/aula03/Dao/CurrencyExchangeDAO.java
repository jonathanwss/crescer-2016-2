/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import br.com.cwi.crescer.aula03.entity.CurrencyExchange;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan-David
 */
public class CurrencyExchangeDAO implements IDaoExercicio<CurrencyExchange> {
    private EntityManager entity;
    
    public CurrencyExchangeDAO(EntityManager entity){
        this.entity = entity;
    }
    
    @Override
    public void insert(CurrencyExchange currencyExchange) {
        entity.getTransaction().begin();
        try{
            entity.persist(currencyExchange);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void delete(CurrencyExchange currencyExchange) {
        entity.getTransaction().begin();
        try{
            entity.remove(currencyExchange);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void update(CurrencyExchange currencyExchange) {
        entity.getTransaction().begin();
        try{
            entity.merge(currencyExchange);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public List<CurrencyExchange> findAll() {
        return entity.createQuery("select c from Currency_Exchange c").getResultList();
    }
    
}
