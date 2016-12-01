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
@Table(name = "ATOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ator.findAll", query = "SELECT a FROM Ator a")
    , @NamedQuery(name = "Ator.findByIdAtor", query = "SELECT a FROM Ator a WHERE a.idAtor = :idAtor")
    , @NamedQuery(name = "Ator.findByNome", query = "SELECT a FROM Ator a WHERE a.nome = :nome")})
public class Ator implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ATOR")
    private BigDecimal idAtor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOME")
    private String nome;

    public Ator() {
    }

    public Ator(BigDecimal idAtor) {
        this.idAtor = idAtor;
    }

    public Ator(BigDecimal idAtor, String nome) {
        this.idAtor = idAtor;
        this.nome = nome;
    }

    public BigDecimal getIdAtor() {
        return idAtor;
    }

    public void setIdAtor(BigDecimal idAtor) {
        this.idAtor = idAtor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtor != null ? idAtor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ator)) {
            return false;
        }
        Ator other = (Ator) object;
        if ((this.idAtor == null && other.idAtor != null) || (this.idAtor != null && !this.idAtor.equals(other.idAtor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cwi.crescer.filme.Dao.entity.Ator[ idAtor=" + idAtor + " ]";
    }
    
}
