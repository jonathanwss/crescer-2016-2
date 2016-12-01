/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.filme.Dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan-David
 */
@Entity
@Table(name = "CLASSIFICAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classificao.findAll", query = "SELECT c FROM Classificao c")
    , @NamedQuery(name = "Classificao.findByIdClassificacao", query = "SELECT c FROM Classificao c WHERE c.idClassificacao = :idClassificacao")
    , @NamedQuery(name = "Classificao.findByDescricao", query = "SELECT c FROM Classificao c WHERE c.descricao = :descricao")
    , @NamedQuery(name = "Classificao.findByIdade", query = "SELECT c FROM Classificao c WHERE c.idade = :idade")})
public class Classificao implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLASSIFICACAO")
    private BigDecimal idClassificacao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "IDADE")
    private BigDecimal idade;

    public Classificao() {
    }

    public Classificao(BigDecimal idClassificacao) {
        this.idClassificacao = idClassificacao;
    }

    public Classificao(BigDecimal idClassificacao, String descricao) {
        this.idClassificacao = idClassificacao;
        this.descricao = descricao;
    }

    public BigDecimal getIdClassificacao() {
        return idClassificacao;
    }

    public void setIdClassificacao(BigDecimal idClassificacao) {
        this.idClassificacao = idClassificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getIdade() {
        return idade;
    }

    public void setIdade(BigDecimal idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClassificacao != null ? idClassificacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classificao)) {
            return false;
        }
        Classificao other = (Classificao) object;
        if ((this.idClassificacao == null && other.idClassificacao != null) || (this.idClassificacao != null && !this.idClassificacao.equals(other.idClassificacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cwi.crescer.filme.Dao.entity.Classificao[ idClassificacao=" + idClassificacao + " ]";
    }
    
}
