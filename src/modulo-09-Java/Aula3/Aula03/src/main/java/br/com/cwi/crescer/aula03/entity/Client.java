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
@Table(name="CLIENT")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_CLIENT")
    @SequenceGenerator(name = "SEQ_CLIENT", sequenceName = "SEQ_CLIENT", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID_CLIENT")
    private Long idCliente;
    
    @Basic(optional = false)
    @Column(name = "DS_EMAIL")
    private String email;
    
    @Basic(optional = false)
    @Column(name = "DS_PASSWORD")
    private String password;
    
    @Basic(optional = false)
    @Column(name = "DS_PREFERED_COIN")
    private String preferedCoin;
    
    @Basic(optional = false)
    @Column(name = "DS_STATE")
    private String state;
    
    @Basic(optional = false)
    @Column(name = "DS_USERNAME")
    private String userName;
    
    
    @Basic(optional = false)
    @Column(name = "NM_CLIENT")
    private String nmClient;
    
    @Basic(optional = false)
    @Column(name = "TP_PERMISSION")
    private String tpPermission;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreferedCoin() {
        return preferedCoin;
    }

    public void setPreferedCoin(String preferedCoin) {
        this.preferedCoin = preferedCoin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNmClient() {
        return nmClient;
    }

    public void setNmClient(String nmClient) {
        this.nmClient = nmClient;
    }

    public String getTpPermission() {
        return tpPermission;
    }

    public void setTpPermission(String tpPermission) {
        this.tpPermission = tpPermission;
    }
    
    
}
