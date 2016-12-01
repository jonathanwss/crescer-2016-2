/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.filme.Dao;
import br.com.cwi.crescer.filme.Dao.entity.Ator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonathan-David
 */
public class AtorBean extends AbstractDao<Ator, Long>{
     @PersistenceContext(unitName = "crescer")
    private EntityManager entityManager;

    public AtorBean() {
        super(Ator.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public List<Ator> findAll() {
        return this.getEntityManager().createQuery("select a from Ator a").getResultList();
    }
}
