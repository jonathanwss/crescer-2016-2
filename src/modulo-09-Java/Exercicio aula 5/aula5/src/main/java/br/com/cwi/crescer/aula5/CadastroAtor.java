/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5;

import br.com.cwi.crescer.aula4.Ator;
import br.com.cwi.crescer.aula4.AtorBean;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Carlos H. Nonnemacher
 */
@ManagedBean
@ViewScoped
public class CadastroAtor {

    @EJB
    private AtorBean atorBean;
    
    private Ator ator;
    private List<Ator> atores;

    @PostConstruct
    public void init() {
        this.ator = new Ator();
        this.atores = atorBean.findAll();
        this.atores.sort((a,b)-> a.getIdAtor().compareTo(b.getIdAtor()));
    }

    public Ator getPessoa() {
        return ator;
    }

    public void setPessoa(Ator pessoa) {
        this.ator = pessoa;
    }

    public List<Ator> getPessoas() {
        return atores;
    }

    public void setPessoas(List<Ator> pessoas) {
        this.atores = pessoas;
    }

    public void adicionar() {
        atorBean.insert(ator);
        this.init();
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Teste", "teste"));
    }
}