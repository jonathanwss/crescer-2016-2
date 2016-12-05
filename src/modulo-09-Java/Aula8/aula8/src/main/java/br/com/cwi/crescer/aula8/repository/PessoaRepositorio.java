/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.repository;

import br.com.cwi.crescer.aula8.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author santos.jonathan
 */
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long> {
    
}