/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5;

import br.com.cwi.crescer.aula4.Ator;
import br.com.cwi.crescer.aula4.AtorBean;
import br.com.cwi.crescer.aula4.Elenco;
import br.com.cwi.crescer.aula4.ElencoBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author santos.jonathan
 */
@ManagedBean
@ViewScoped
public class CadastroElenco {

    @EJB
    private ElencoBean elencoBean;
    @EJB
    private AtorBean atorbean;
    
    private Elenco elenco;
    private List<Elenco> elencos;
    private List<String> Ids;
    @PostConstruct
    public void init() {
        this.elenco = new Elenco();
        this.elencos = elencoBean.findAll();
        this.elenco.setAtores(atorbean.findAll());
        this.elencos.sort((a,b)-> a.getIdElenco().compareTo(b.getIdElenco()));
    }

    public List<String> getIds() {
        return Ids;
    }

    public void setIds(List<String> Ids) {
        this.Ids = Ids;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public List<Elenco> getElencos() {
        return elencos;
    }

    public void setElencos(List<Elenco> elencos) {
        this.elencos = elencos;
    }

    public void adicionar() {
        //TO DO
        List<Ator> a = atorbean.findAll();
        List<BigDecimal> listaIds = new ArrayList<>();
        Ids.forEach( v -> {
            listaIds.add(BigDecimal.valueOf(Long.parseLong(v)));
        });
        List<Ator> atorez = new ArrayList<>();
        for(BigDecimal id : listaIds){
            elenco.getAtores().clear();
            for(Ator b : a){
                if(b.getIdAtor() == id){
                    atorez.add(b);
                }
            }
        }
        elenco.setAtores(atorez);
        elencoBean.insert(elenco);
        this.init();
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Teste", "teste"));
    }
}
