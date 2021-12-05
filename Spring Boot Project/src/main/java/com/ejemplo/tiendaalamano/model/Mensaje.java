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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "mensaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mensaje.findAll", query = "SELECT m FROM Mensaje m")})
public class Mensaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_mensaje")
    private Integer codMensaje;
    @Basic(optional = false)
    @Column(name = "tipo_mensaje")
    private short tipoMensaje;
    @Basic(optional = false)
    @Column(name = "texto_mensaje")
    private String textoMensaje;
    @Basic(optional = false)
    @Column(name = "fecha_mensaje")
    @Temporal(TemporalType.DATE)
    private Date fechaMensaje;
    @Basic(optional = false)
    @Column(name = "cod_user_pedido_mensaje")
    private int codUserPedidoMensaje;

    public Mensaje() {
    }

    public Mensaje(Integer codMensaje) {
        this.codMensaje = codMensaje;
    }

    public Mensaje(Integer codMensaje, short tipoMensaje, String textoMensaje, Date fechaMensaje, int codUserPedidoMensaje) {
        this.codMensaje = codMensaje;
        this.tipoMensaje = tipoMensaje;
        this.textoMensaje = textoMensaje;
        this.fechaMensaje = fechaMensaje;
        this.codUserPedidoMensaje = codUserPedidoMensaje;
    }

    public Integer getCodMensaje() {
        return codMensaje;
    }

    public void setCodMensaje(Integer codMensaje) {
        this.codMensaje = codMensaje;
    }

    public short getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(short tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getTextoMensaje() {
        return textoMensaje;
    }

    public void setTextoMensaje(String textoMensaje) {
        this.textoMensaje = textoMensaje;
    }

    public Date getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(Date fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }

    public int getCodUserPedidoMensaje() {
        return codUserPedidoMensaje;
    }

    public void setCodUserPedidoMensaje(int codUserPedidoMensaje) {
        this.codUserPedidoMensaje = codUserPedidoMensaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMensaje != null ? codMensaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mensaje)) {
            return false;
        }
        Mensaje other = (Mensaje) object;
        if ((this.codMensaje == null && other.codMensaje != null) || (this.codMensaje != null && !this.codMensaje.equals(other.codMensaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Mensaje[ codMensaje=" + codMensaje + " ]";
    }
    
}
