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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Edinson
 */
@Entity
@Table(name = "envio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Envio.findAll", query = "SELECT e FROM Envio e")})
public class Envio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_envio")
    private Integer codEnvio;
    @Basic(optional = false)
    @Column(name = "tipo_envio")
    private short tipoEnvio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio_envio")
    private BigDecimal precioEnvio;
    @Basic(optional = false)
    @Column(name = "descuento_envio")
    private BigDecimal descuentoEnvio;
    @Basic(optional = false)
    @Column(name = "estado_envio")
    private short estadoEnvio;
    @Basic(optional = false)
    @Column(name = "notas_envio")
    private String notasEnvio;
    @JoinColumn(name = "cod_direccion", referencedColumnName = "cod_direccion")
    @ManyToOne(fetch = FetchType.EAGER)
    private Direccion codDireccion;
    @JoinColumn(name = "cod_domi", referencedColumnName = "cod_domi")
    @ManyToOne(fetch = FetchType.EAGER)
    private Domiciliario codDomi;

    public Envio() {
    }

    public Envio(Integer codEnvio) {
        this.codEnvio = codEnvio;
    }

    public Envio(Integer codEnvio, short tipoEnvio, BigDecimal precioEnvio, BigDecimal descuentoEnvio, short estadoEnvio, String notasEnvio) {
        this.codEnvio = codEnvio;
        this.tipoEnvio = tipoEnvio;
        this.precioEnvio = precioEnvio;
        this.descuentoEnvio = descuentoEnvio;
        this.estadoEnvio = estadoEnvio;
        this.notasEnvio = notasEnvio;
    }

    public Integer getCodEnvio() {
        return codEnvio;
    }

    public void setCodEnvio(Integer codEnvio) {
        this.codEnvio = codEnvio;
    }

    public short getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(short tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public BigDecimal getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(BigDecimal precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public BigDecimal getDescuentoEnvio() {
        return descuentoEnvio;
    }

    public void setDescuentoEnvio(BigDecimal descuentoEnvio) {
        this.descuentoEnvio = descuentoEnvio;
    }

    public short getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(short estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getNotasEnvio() {
        return notasEnvio;
    }

    public void setNotasEnvio(String notasEnvio) {
        this.notasEnvio = notasEnvio;
    }

    public Direccion getCodDireccion() {
        return codDireccion;
    }

    public void setCodDireccion(Direccion codDireccion) {
        this.codDireccion = codDireccion;
    }

    public Domiciliario getCodDomi() {
        return codDomi;
    }

    public void setCodDomi(Domiciliario codDomi) {
        this.codDomi = codDomi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEnvio != null ? codEnvio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Envio)) {
            return false;
        }
        Envio other = (Envio) object;
        if ((this.codEnvio == null && other.codEnvio != null) || (this.codEnvio != null && !this.codEnvio.equals(other.codEnvio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Envio[ codEnvio=" + codEnvio + " ]";
    }
    
}
