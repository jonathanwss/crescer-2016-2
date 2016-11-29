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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 *
 * @author Jonathan-David
 */
@Entity
@Table(name = "Currency_Exchange")
public class CurrencyExchange implements Serializable {
    
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_CURRENCY_EXCHANGE")
    @SequenceGenerator(name = "SEQ_CURRENCY_EXCHANGE", sequenceName = "SEQ_CURRENCY_EXCHANGE", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID_CURRENCY_EXCHANGE")
    private Long idCurrencyExchange;
    
    @Basic(optional = false)
    @Column(name = "DS_COIN")
    private String coin;
    
    @Basic(optional = false)
    @Column(name = "DT_CURRENCY_EXCHANGE")
    private String currecyExchange;
    
    @Basic(optional = false)
    @Column(name = "VL_RATE")
    private Long rate;

    public Long getIdCurrencyExchange() {
        return idCurrencyExchange;
    }

    public void setIdCurrencyExchange(Long idCurrencyExchange) {
        this.idCurrencyExchange = idCurrencyExchange;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getCurrecyExchange() {
        return currecyExchange;
    }

    public void setCurrecyExchange(String currecyExchange) {
        this.currecyExchange = currecyExchange;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }
    
    
}
