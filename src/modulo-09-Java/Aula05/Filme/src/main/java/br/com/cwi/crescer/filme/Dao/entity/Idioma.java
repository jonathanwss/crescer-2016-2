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
@Table(name = "IDIOMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Idioma.findAll", query = "SELECT i FROM Idioma i")
    , @NamedQuery(name = "Idioma.findByIdIdioma", query = "SELECT i FROM Idioma i WHERE i.idIdioma = :idIdioma")
    , @NamedQuery(name = "Idioma.findByNome", query = "SELECT i FROM Idioma i WHERE i.nome = :nome")})
public class Idioma implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_IDIOMA")
    private BigDecimal idIdioma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOME")
    private String nome;

    public Idioma() {
    }

    public Idioma(BigDecimal idIdioma) {
        this.idIdioma = idIdioma;
    }

    public Idioma(BigDecimal idIdioma, String nome) {
        this.idIdioma = idIdioma;
        this.nome = nome;
    }

    public BigDecimal getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(BigDecimal idIdioma) {
        this.idIdioma = idIdioma;
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
        hash += (idIdioma != null ? idIdioma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Idioma)) {
            return false;
        }
        Idioma other = (Idioma) object;
        if ((this.idIdioma == null && other.idIdioma != null) || (this.idIdioma != null && !this.idIdioma.equals(other.idIdioma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cwi.crescer.filme.Dao.entity.Idioma[ idIdioma=" + idIdioma + " ]";
    }
    
}
