/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Edinson
 */
@Embeddable
public class ConfigpuntoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cod_confpuntos")
    private int codConfpuntos;
    @Basic(optional = false)
    @Column(name = "cantidad_confpuntos")
    private short cantidadConfpuntos;

    public ConfigpuntoPK() {
    }

    public ConfigpuntoPK(int codConfpuntos, short cantidadConfpuntos) {
        this.codConfpuntos = codConfpuntos;
        this.cantidadConfpuntos = cantidadConfpuntos;
    }

    public int getCodConfpuntos() {
        return codConfpuntos;
    }

    public void setCodConfpuntos(int codConfpuntos) {
        this.codConfpuntos = codConfpuntos;
    }

    public short getCantidadConfpuntos() {
        return cantidadConfpuntos;
    }

    public void setCantidadConfpuntos(short cantidadConfpuntos) {
        this.cantidadConfpuntos = cantidadConfpuntos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codConfpuntos;
        hash += (int) cantidadConfpuntos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfigpuntoPK)) {
            return false;
        }
        ConfigpuntoPK other = (ConfigpuntoPK) object;
        if (this.codConfpuntos != other.codConfpuntos) {
            return false;
        }
        if (this.cantidadConfpuntos != other.cantidadConfpuntos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.ConfigpuntoPK[ codConfpuntos=" + codConfpuntos + ", cantidadConfpuntos=" + cantidadConfpuntos + " ]";
    }
    
}
