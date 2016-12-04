/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula4;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.Size;

/**
 *
 * @author Jonathan-David
 */
@Entity
@Table(name="Filme")
public class Filme implements Serializable{
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_FILME")
    @SequenceGenerator(name = "SEQ_FILME", sequenceName = "SEQ_FILME", allocationSize = 1)
    @Column(name = "ID_FILME")
    private BigDecimal idFilme;
    
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "TITULO")
    private String titulo;
    
    @Basic(optional = false)
    @Size(min = 1, max = 100)
    private String Diretor;
    
    @Basic(optional = true)
    @Column(name="DATA_ESTREIA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEstreia;
    
    @ManyToOne(cascade = ALL)
    private Classificacao classificacao;
    
    @ManyToOne(cascade = ALL)
    private Elenco elenco;
    
    @ManyToOne(cascade = ALL)
    private Idioma idiomas;
    
    @ManyToOne(cascade = ALL)
    private Genero genero;

    public BigDecimal getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(BigDecimal idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    public Date getDataEstreia() {
        return dataEstreia;
    }

    public void setDataEstreia(Date dataEstreia) {
        this.dataEstreia = dataEstreia;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public Idioma getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idioma idiomas) {
        this.idiomas = idiomas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString(){
        return ""+idFilme;
    }
}