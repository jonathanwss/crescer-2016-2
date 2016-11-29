/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03.entity;
import java.io.Serializable;
import javax.persistence.Basic;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 *
 * @author Jonathan-David
 */
@Entity
@Table(name = "Cotacao")
public class Cotacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_COTACAO")
    @SequenceGenerator(name = "SEQ_COTACAO", sequenceName = "SEQ_COTACAO", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID_COTACAO")
    private  Long idCotacao;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_DOLAR_AUSTRALIANO")
    private Long cotacaoDollarAustraliano;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_DOLAR_CANADENSE")
    private Long cotacaoDollarCanadense;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_EURO")
    private Long cotacaoEuro;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_FRANCO_SUICO")
    private Long cotacaoFrancoSuico;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_LIBRA")
    private Long cotacaoLibra;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_REAL")
    private Long cotacaoReal;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_YEN")
    private Long cotacaoYen;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_YUAN")
    private Long cotacaoYuan;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO")
    private String cotacao;

    public Long getIdCotacao() {
        return idCotacao;
    }

    public void setIdCotacao(Long idCotacao) {
        this.idCotacao = idCotacao;
    }

    public Long getCotacaoDollarAustraliano() {
        return cotacaoDollarAustraliano;
    }

    public void setCotacaoDollarAustraliano(Long cotacaoDollarAustraliano) {
        this.cotacaoDollarAustraliano = cotacaoDollarAustraliano;
    }

    public Long getCotacaoDollarCanadense() {
        return cotacaoDollarCanadense;
    }

    public void setCotacaoDollarCanadense(Long cotacaoDollarCanadense) {
        this.cotacaoDollarCanadense = cotacaoDollarCanadense;
    }

    public Long getCotacaoEuro() {
        return cotacaoEuro;
    }

    public void setCotacaoEuro(Long cotacaoEuro) {
        this.cotacaoEuro = cotacaoEuro;
    }

    public Long getCotacaoFrancoSuico() {
        return cotacaoFrancoSuico;
    }

    public void setCotacaoFrancoSuico(Long cotacaoFrancoSuico) {
        this.cotacaoFrancoSuico = cotacaoFrancoSuico;
    }

    public Long getCotacaoLibra() {
        return cotacaoLibra;
    }

    public void setCotacaoLibra(Long cotacaoLibra) {
        this.cotacaoLibra = cotacaoLibra;
    }

    public Long getCotacaoReal() {
        return cotacaoReal;
    }

    public void setCotacaoReal(Long cotacaoReal) {
        this.cotacaoReal = cotacaoReal;
    }

    public Long getCotacaoYen() {
        return cotacaoYen;
    }

    public void setCotacaoYen(Long cotacaoYen) {
        this.cotacaoYen = cotacaoYen;
    }

    public Long getCotacaoYuan() {
        return cotacaoYuan;
    }

    public void setCotacaoYuan(Long cotacaoYuan) {
        this.cotacaoYuan = cotacaoYuan;
    }

    public String getCotacao() {
        return cotacao;
    }

    public void setCotacao(String cotacao) {
        this.cotacao = cotacao;
    }
    
    
}
