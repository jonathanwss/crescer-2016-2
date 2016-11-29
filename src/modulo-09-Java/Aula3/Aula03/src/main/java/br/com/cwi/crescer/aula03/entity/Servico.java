/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 *
 * @author Jonathan-David
 */
@Entity
@Table(name="Servico")
public class Servico implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_SERVICO")
    @SequenceGenerator(name = "SEQ_SERVICO", sequenceName = "SEQ_SERVICO", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID_SERVICO")
    private Long idServico;
    
    @Basic(optional = false)
    @Column(name = "DS_DESCRICAO")
    private String descricao;
    
    @Basic(optional = false)
    @Column(name = "DS_PERIODICIDADE")
    private String periodicidade;
    
    @Basic(optional = false)
    @Column(name = "DS_SIMBOLO_MOEDA")
    private String simboloMoeda;
    
    @Basic(optional = false)
    @Column(name = "DS_SITUACAO")
    private String situacao;
    
    @Basic(optional = false)
    @Column(name = "DS_WEB_SITE")
    private String webSite;
    
    @Basic(optional = false)
    @Column(name = "NM_SERVICO")
    private String nmServico;
    
    @Basic(optional = false)
    @Column(name = "VL_MENSAL_USD")
    private Long valorMensalUsd;
    
    @Basic(optional = false)
    @Column(name = "VL_TOTAL_SERVICO")
    private Long valorTotalServico;
    
    @ManyToOne
    private Usuario usuario;

    public Long getIdServico() {
        return idServico;
    }

    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String getSimboloMoeda() {
        return simboloMoeda;
    }

    public void setSimboloMoeda(String simboloMoeda) {
        this.simboloMoeda = simboloMoeda;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getNmServico() {
        return nmServico;
    }

    public void setNmServico(String nmServico) {
        this.nmServico = nmServico;
    }

    public Long getValorMensalUsd() {
        return valorMensalUsd;
    }

    public void setValorMensalUsd(Long valorMensalUsd) {
        this.valorMensalUsd = valorMensalUsd;
    }

    public Long getValorTotalServico() {
        return valorTotalServico;
    }

    public void setValorTotalServico(Long valorTotalServico) {
        this.valorTotalServico = valorTotalServico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
