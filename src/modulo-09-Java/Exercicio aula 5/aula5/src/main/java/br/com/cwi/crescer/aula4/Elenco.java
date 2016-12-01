/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula4;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author santos.jonathan
 */
@Entity
@Table(name="Elenco")
public class Elenco implements Serializable{
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_ELENCO")
    @SequenceGenerator(name = "SEQ_ELENCO", sequenceName = "SEQ_ELENCO", allocationSize = 1)
    @Column(name = "ID_ELENCO")
    private BigDecimal idElenco;
    
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "NOME")
    private String nome;
    
    @OneToMany
    @Column(name = "ATORES")
    @Basic(optional = false)
    private List<Ator> atores;

    public BigDecimal getIdElenco() {
        return idElenco;
    }

    public void setIdElenco(BigDecimal idElenco) {
        this.idElenco = idElenco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
}
