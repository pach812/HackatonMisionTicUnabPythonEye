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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_producto")
    private Integer codProducto;
    @Basic(optional = false)
    @Lob
    @Column(name = "nombre_producto")
    private byte[] nombreProducto;
    @Basic(optional = false)
    @Column(name = "estado_producto")
    private short estadoProducto;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codProducto", fetch = FetchType.EAGER)
//    private List<Pedidodetalle> pedidodetalleList;
    
    @ManyToOne
    @JoinColumn(name = "cod_categoria")
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "cod_impuesto")
    private Impuesto impuesto;
    @ManyToOne
    @JoinColumn(name = "cod_marca")
    private Marca marca;
    @ManyToOne
    @JoinColumn(name = "cod_cupon")
    private Cupones cupones;
    
//    @JoinColumn(name = "cod_categoria", referencedColumnName = "cod_categoria")
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Categoria codCategoria;
//    @JoinColumn(name = "cod_impuesto", referencedColumnName = "cod_impuesto")
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Impuesto codImpuesto;
//    @JoinColumn(name = "cod_marca", referencedColumnName = "cod_marca")
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Marca codMarca;
//    @JoinColumn(name = "cod_cupon", referencedColumnName = "cod_cupon")
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Cupones codCupon;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.categoria = Categoria;
    }

    public Impuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Impuesto Impuesto) {
        this.impuesto = Impuesto;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca Marca) {
        this.marca = Marca;
    }

    public Cupones getCupones() {
        return cupones;
    }

    public void setCupones(Cupones Cupones) {
        this.cupones = Cupones;
    }
    
    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codProducto", fetch = FetchType.EAGER)
//    private List<Carrito> carritoList;

    public Producto() {
    }

    public Producto(Integer codProducto) {
        this.codProducto = codProducto;
    }

    public Producto(Integer codProducto, byte[] nombreProducto, short estadoProducto) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.estadoProducto = estadoProducto;
    }

    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
    }

    public byte[] getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(byte[] nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public short getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(short estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

//    @XmlTransient
//    public List<Pedidodetalle> getPedidodetalleList() {
//        return pedidodetalleList;
//    }
//
//    public void setPedidodetalleList(List<Pedidodetalle> pedidodetalleList) {
//        this.pedidodetalleList = pedidodetalleList;
//    }

//    public Categoria getCodCategoria() {
//        return codCategoria;
//    }
//
//    public void setCodCategoria(Categoria codCategoria) {
//        this.codCategoria = codCategoria;
//    }
//
//    public Impuesto getCodImpuesto() {
//        return codImpuesto;
//    }
//
//    public void setCodImpuesto(Impuesto codImpuesto) {
//        this.codImpuesto = codImpuesto;
//    }
//
//    public Marca getCodMarca() {
//        return codMarca;
//    }
//
//    public void setCodMarca(Marca codMarca) {
//        this.codMarca = codMarca;
//    }
//
//    public Cupones getCodCupon() {
//        return codCupon;
//    }
//
//    public void setCodCupon(Cupones codCupon) {
//        this.codCupon = codCupon;
//    }

//    @XmlTransient
//    public List<Carrito> getCarritoList() {
//        return carritoList;
//    }
//
//    public void setCarritoList(List<Carrito> carritoList) {
//        this.carritoList = carritoList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProducto != null ? codProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.codProducto == null && other.codProducto != null) || (this.codProducto != null && !this.codProducto.equals(other.codProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Producto[ codProducto=" + codProducto + " ]";
    }
    
}
