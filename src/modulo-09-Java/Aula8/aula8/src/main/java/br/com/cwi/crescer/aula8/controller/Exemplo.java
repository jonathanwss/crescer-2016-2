/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Carlos H. Nonnemacher
 */
@Controller
public class Exemplo {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String toIndex(Model model, @RequestParam String nome) {
        model.addAttribute("name", nome );
        return "index";
    }
}