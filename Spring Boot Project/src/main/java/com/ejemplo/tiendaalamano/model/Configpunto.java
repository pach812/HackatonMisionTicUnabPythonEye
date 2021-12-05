/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Edinson
 */
@Entity
@Table(name = "configpunto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Configpunto.findAll", query = "SELECT c FROM Configpunto c")})
public class Configpunto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConfigpuntoPK configpuntoPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor_confpuntos")
    private BigDecimal valorConfpuntos;

    public Configpunto() {
    }

    public Configpunto(ConfigpuntoPK configpuntoPK) {
        this.configpuntoPK = configpuntoPK;
    }

    public Configpunto(ConfigpuntoPK configpuntoPK, BigDecimal valorConfpuntos) {
        this.configpuntoPK = configpuntoPK;
        this.valorConfpuntos = valorConfpuntos;
    }

    public Configpunto(int codConfpuntos, short cantidadConfpuntos) {
        this.configpuntoPK = new ConfigpuntoPK(codConfpuntos, cantidadConfpuntos);
    }

    public ConfigpuntoPK getConfigpuntoPK() {
        return configpuntoPK;
    }

    public void setConfigpuntoPK(ConfigpuntoPK configpuntoPK) {
        this.configpuntoPK = configpuntoPK;
    }

    public BigDecimal getValorConfpuntos() {
        return valorConfpuntos;
    }

    public void setValorConfpuntos(BigDecimal valorConfpuntos) {
        this.valorConfpuntos = valorConfpuntos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (configpuntoPK != null ? configpuntoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Configpunto)) {
            return false;
        }
        Configpunto other = (Configpunto) object;
        if ((this.configpuntoPK == null && other.configpuntoPK != null) || (this.configpuntoPK != null && !this.configpuntoPK.equals(other.configpuntoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Configpunto[ configpuntoPK=" + configpuntoPK + " ]";
    }
    
}
