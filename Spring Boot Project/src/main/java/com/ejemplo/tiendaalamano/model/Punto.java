/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Edinson
 */
@Entity
@Table(name = "punto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Punto.findAll", query = "SELECT p FROM Punto p")})
public class Punto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_punto")
    private Integer codPunto;
    @Basic(optional = false)
    @Column(name = "cantidad_punto")
    private int cantidadPunto;
    @Basic(optional = false)
    @Column(name = "expiracion_punto")
    @Temporal(TemporalType.DATE)
    private Date expiracionPunto;
    @Basic(optional = false)
    @Column(name = "cambiados_punto")
    private int cambiadosPunto;
    @Basic(optional = false)
    @Column(name = "activos_punto")
    private int activosPunto;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario codUsuario;

    public Punto() {
    }

    public Punto(Integer codPunto) {
        this.codPunto = codPunto;
    }

    public Punto(Integer codPunto, int cantidadPunto, Date expiracionPunto, int cambiadosPunto, int activosPunto) {
        this.codPunto = codPunto;
        this.cantidadPunto = cantidadPunto;
        this.expiracionPunto = expiracionPunto;
        this.cambiadosPunto = cambiadosPunto;
        this.activosPunto = activosPunto;
    }

    public Integer getCodPunto() {
        return codPunto;
    }

    public void setCodPunto(Integer codPunto) {
        this.codPunto = codPunto;
    }

    public int getCantidadPunto() {
        return cantidadPunto;
    }

    public void setCantidadPunto(int cantidadPunto) {
        this.cantidadPunto = cantidadPunto;
    }

    public Date getExpiracionPunto() {
        return expiracionPunto;
    }

    public void setExpiracionPunto(Date expiracionPunto) {
        this.expiracionPunto = expiracionPunto;
    }

    public int getCambiadosPunto() {
        return cambiadosPunto;
    }

    public void setCambiadosPunto(int cambiadosPunto) {
        this.cambiadosPunto = cambiadosPunto;
    }

    public int getActivosPunto() {
        return activosPunto;
    }

    public void setActivosPunto(int activosPunto) {
        this.activosPunto = activosPunto;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPunto != null ? codPunto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Punto)) {
            return false;
        }
        Punto other = (Punto) object;
        if ((this.codPunto == null && other.codPunto != null) || (this.codPunto != null && !this.codPunto.equals(other.codPunto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Punto[ codPunto=" + codPunto + " ]";
    }
    
}
