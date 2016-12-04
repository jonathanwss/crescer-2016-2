/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5;

import br.com.cwi.crescer.aula4.Classificacao;
import br.com.cwi.crescer.aula4.ClassificacaoBean;
import br.com.cwi.crescer.aula4.Elenco;
import br.com.cwi.crescer.aula4.ElencoBean;
import br.com.cwi.crescer.aula4.Filme;
import br.com.cwi.crescer.aula4.FilmeBean;
import br.com.cwi.crescer.aula4.Genero;
import br.com.cwi.crescer.aula4.GeneroBean;
import br.com.cwi.crescer.aula4.Idioma;
import br.com.cwi.crescer.aula4.IdiomaBean;
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
public class FilmeCadastro {

    @EJB
    private FilmeBean filmeBean;
    @EJB
    private ElencoBean elencoBean;
    @EJB
    private ClassificacaoBean classificacaoBean;
    @EJB
    private GeneroBean generoBean;
    @EJB
    private IdiomaBean idiomaBean;
    
    private Filme filme;
    private List<Filme> filmes;
    private String idIdioma;
    private String idGenero;
    private String idClassificacao;
    private String idElenco;

    public String getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(String idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }

    public String getIdClassificacao() {
        return idClassificacao;
    }

    public void setIdClassificacao(String idClassificacao) {
        this.idClassificacao = idClassificacao;
    }

    public String getIdElenco() {
        return idElenco;
    }

    public void setIdElenco(String idElenco) {
        this.idElenco = idElenco;
    }
    
    @PostConstruct
    public void init() {
        this.filme = new Filme();
        this.filmes = filmeBean.findAll();
        this.filmes.sort((a,b)-> a.getIdFilme().compareTo(b.getIdFilme()));
    }
 
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filme) {
        this.filmes = filme;
    }

    public void adicionar() {
        Classificacao c = classificacaoBean.find(Long.parseLong(idClassificacao));
        filme.setClassificacao(c);
        Genero g = generoBean.find(Long.parseLong(idGenero));
        filme.setGenero(g);
        Idioma i = idiomaBean.find(Long.parseLong(idIdioma));
        filme.setIdiomas(i);
        Elenco e = elencoBean.find(Long.parseLong(idElenco));
        filme.setElenco(e);
        filmeBean.insert(filme);
        this.init();
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Teste", "teste"));
    }
}
