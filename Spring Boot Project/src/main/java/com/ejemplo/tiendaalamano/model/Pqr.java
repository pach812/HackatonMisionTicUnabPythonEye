/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
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
@Table(name = "pqr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pqr.findAll", query = "SELECT p FROM Pqr p")})
public class Pqr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_pqr")
    private Integer codPqr;
    @Basic(optional = false)
    @Column(name = "tipo_pqr")
    private short tipoPqr;
    @Basic(optional = false)
    @Column(name = "texto__pqr")
    private String textoPqr;
    @Basic(optional = false)
    @Column(name = "estado_pqr")
    private short estadoPqr;
    @JoinColumn(name = "cod_pedido", referencedColumnName = "cod_pedido")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pedido codPedido;

    public Pqr() {
    }

    public Pqr(Integer codPqr) {
        this.codPqr = codPqr;
    }

    public Pqr(Integer codPqr, short tipoPqr, String textoPqr, short estadoPqr) {
        this.codPqr = codPqr;
        this.tipoPqr = tipoPqr;
        this.textoPqr = textoPqr;
        this.estadoPqr = estadoPqr;
    }

    public Integer getCodPqr() {
        return codPqr;
    }

    public void setCodPqr(Integer codPqr) {
        this.codPqr = codPqr;
    }

    public short getTipoPqr() {
        return tipoPqr;
    }

    public void setTipoPqr(short tipoPqr) {
        this.tipoPqr = tipoPqr;
    }

    public String getTextoPqr() {
        return textoPqr;
    }

    public void setTextoPqr(String textoPqr) {
        this.textoPqr = textoPqr;
    }

    public short getEstadoPqr() {
        return estadoPqr;
    }

    public void setEstadoPqr(short estadoPqr) {
        this.estadoPqr = estadoPqr;
    }

    public Pedido getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(Pedido codPedido) {
        this.codPedido = codPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPqr != null ? codPqr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pqr)) {
            return false;
        }
        Pqr other = (Pqr) object;
        if ((this.codPqr == null && other.codPqr != null) || (this.codPqr != null && !this.codPqr.equals(other.codPqr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Pqr[ codPqr=" + codPqr + " ]";
    }
    
}
