/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Edinson
 */
@Entity
@Table(name = "formapago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formapago.findAll", query = "SELECT f FROM Formapago f")})
public class Formapago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_formapago")
    private Integer codFormapago;
    @Basic(optional = false)
    @Column(name = "nombre_formapago")
    private String nombreFormapago;
    @Column(name = "estado_formapago")
    private Short estadoFormapago;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codFormapago", fetch = FetchType.EAGER)
    private List<Pedido> pedidoList;

    public Formapago() {
    }

    public Formapago(Integer codFormapago) {
        this.codFormapago = codFormapago;
    }

    public Formapago(Integer codFormapago, String nombreFormapago) {
        this.codFormapago = codFormapago;
        this.nombreFormapago = nombreFormapago;
    }

    public Integer getCodFormapago() {
        return codFormapago;
    }

    public void setCodFormapago(Integer codFormapago) {
        this.codFormapago = codFormapago;
    }

    public String getNombreFormapago() {
        return nombreFormapago;
    }

    public void setNombreFormapago(String nombreFormapago) {
        this.nombreFormapago = nombreFormapago;
    }

    public Short getEstadoFormapago() {
        return estadoFormapago;
    }

    public void setEstadoFormapago(Short estadoFormapago) {
        this.estadoFormapago = estadoFormapago;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFormapago != null ? codFormapago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formapago)) {
            return false;
        }
        Formapago other = (Formapago) object;
        if ((this.codFormapago == null && other.codFormapago != null) || (this.codFormapago != null && !this.codFormapago.equals(other.codFormapago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Formapago[ codFormapago=" + codFormapago + " ]";
    }
    
}
