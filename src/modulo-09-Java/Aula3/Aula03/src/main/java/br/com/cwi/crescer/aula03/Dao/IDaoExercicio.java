/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.Dao;

import java.util.List;

/**
 *
 * @author Jonathan-David
 * @param <T>
 */
public interface IDaoExercicio<T> {
    void insert(T t);
    
    void delete(T  t);
    
    void update(T t); 
    
    List<T> findAll();
}
