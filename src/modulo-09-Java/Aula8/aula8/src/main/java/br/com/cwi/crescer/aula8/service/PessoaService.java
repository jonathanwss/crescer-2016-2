/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.service;

import br.com.cwi.crescer.aula8.model.Pessoa;
import br.com.cwi.crescer.aula8.repository.PessoaRepositorio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santos.jonathan
 */
@Service
public class PessoaService {
    @Autowired
    private PessoaRepositorio repository;
    
    public Iterable<Pessoa> listAll(){
        return repository.findAll();
    }
    
    public void add(Pessoa p){
        p.setNascimento(new Date());
        repository.save(p);
    }
}
