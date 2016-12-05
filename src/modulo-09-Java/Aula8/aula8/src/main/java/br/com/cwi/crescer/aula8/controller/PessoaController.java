/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.controller;

import br.com.cwi.crescer.aula8.model.Pessoa;
import br.com.cwi.crescer.aula8.service.PessoaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author santos.jonathan
 */
@RestController
public class PessoaController {
    @Autowired
    private PessoaService service;
    
    @RequestMapping(value = "/pessoa", method = GET)
    public Iterable<Pessoa> list() {
        return service.listAll();
    }
    
    @RequestMapping(value = "/pessoa", method = POST)
    public Iterable<Pessoa> add(@RequestBody Pessoa p){
        service.add(p);
        return service.listAll();
    }
}