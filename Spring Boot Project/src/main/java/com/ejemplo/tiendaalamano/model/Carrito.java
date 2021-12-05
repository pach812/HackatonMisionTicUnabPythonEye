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
@Table(name = "carrito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrito.findAll", query = "SELECT c FROM Carrito c")})
public class Carrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_carrito")
    private Integer codCarrito;
    @Basic(optional = false)
    @Column(name = "cantidad_producto")
    private short cantidadProducto;
    @JoinColumn(name = "cod_producto", referencedColumnName = "cod_producto")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Producto codProducto;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario codUsuario;

    public Carrito() {
    }

    public Carrito(Integer codCarrito) {
        this.codCarrito = codCarrito;
    }

    public Carrito(Integer codCarrito, short cantidadProducto) {
        this.codCarrito = codCarrito;
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getCodCarrito() {
        return codCarrito;
    }

    public void setCodCarrito(Integer codCarrito) {
        this.codCarrito = codCarrito;
    }

    public short getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(short cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Producto getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Producto codProducto) {
        this.codProducto = codProducto;
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
        hash += (codCarrito != null ? codCarrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrito)) {
            return false;
        }
        Carrito other = (Carrito) object;
        if ((this.codCarrito == null && other.codCarrito != null) || (this.codCarrito != null && !this.codCarrito.equals(other.codCarrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Carrito[ codCarrito=" + codCarrito + " ]";
    }
    
}
