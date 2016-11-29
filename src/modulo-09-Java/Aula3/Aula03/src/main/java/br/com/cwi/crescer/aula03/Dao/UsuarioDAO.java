/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import br.com.cwi.crescer.aula03.entity.Usuario;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan-David
 */
public class UsuarioDAO implements IDaoExercicio<Usuario> {
    private EntityManager entity;
    
    public UsuarioDAO(EntityManager entity){
        this.entity = entity;
    }
    
    @Override
    public void insert(Usuario usuario) {
        entity.getTransaction().begin();
        try{
            entity.persist(usuario);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Usuario usuario) {
        entity.getTransaction().begin();
        try{
            entity.remove(usuario);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public void update(Usuario usuario) {
        entity.getTransaction().begin();
        try{
            entity.merge(usuario);
            entity.flush();
            
            entity.getTransaction().commit();
        }catch(Exception e){
            entity.getTransaction().rollback();
        }
    }

    @Override
    public List<Usuario> findAll() {
        return entity.createQuery("select u from Usuario u").getResultList();
    }
    
}
