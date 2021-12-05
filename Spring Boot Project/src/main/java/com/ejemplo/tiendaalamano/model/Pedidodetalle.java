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
@Table(name = "pedidodetalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidodetalle.findAll", query = "SELECT p FROM Pedidodetalle p")})
public class Pedidodetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_pedidodetalle")
    private Integer codPedidodetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "impuestos_pedidodetalle")
    private BigDecimal impuestosPedidodetalle;
    @Basic(optional = false)
    @Column(name = "descuentos_pedidodetalle")
    private BigDecimal descuentosPedidodetalle;
    @Column(name = "comentario_pedidodetalle")
    private String comentarioPedidodetalle;
    @Basic(optional = false)
    @Column(name = "estadopro_pedidodetalle")
    private short estadoproPedidodetalle;
    @JoinColumn(name = "cod_pedido", referencedColumnName = "cod_pedido")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Pedido codPedido;
    @JoinColumn(name = "cod_producto", referencedColumnName = "cod_producto")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Producto codProducto;

    public Pedidodetalle() {
    }

    public Pedidodetalle(Integer codPedidodetalle) {
        this.codPedidodetalle = codPedidodetalle;
    }

    public Pedidodetalle(Integer codPedidodetalle, BigDecimal impuestosPedidodetalle, BigDecimal descuentosPedidodetalle, short estadoproPedidodetalle) {
        this.codPedidodetalle = codPedidodetalle;
        this.impuestosPedidodetalle = impuestosPedidodetalle;
        this.descuentosPedidodetalle = descuentosPedidodetalle;
        this.estadoproPedidodetalle = estadoproPedidodetalle;
    }

    public Integer getCodPedidodetalle() {
        return codPedidodetalle;
    }

    public void setCodPedidodetalle(Integer codPedidodetalle) {
        this.codPedidodetalle = codPedidodetalle;
    }

    public BigDecimal getImpuestosPedidodetalle() {
        return impuestosPedidodetalle;
    }

    public void setImpuestosPedidodetalle(BigDecimal impuestosPedidodetalle) {
        this.impuestosPedidodetalle = impuestosPedidodetalle;
    }

    public BigDecimal getDescuentosPedidodetalle() {
        return descuentosPedidodetalle;
    }

    public void setDescuentosPedidodetalle(BigDecimal descuentosPedidodetalle) {
        this.descuentosPedidodetalle = descuentosPedidodetalle;
    }

    public String getComentarioPedidodetalle() {
        return comentarioPedidodetalle;
    }

    public void setComentarioPedidodetalle(String comentarioPedidodetalle) {
        this.comentarioPedidodetalle = comentarioPedidodetalle;
    }

    public short getEstadoproPedidodetalle() {
        return estadoproPedidodetalle;
    }

    public void setEstadoproPedidodetalle(short estadoproPedidodetalle) {
        this.estadoproPedidodetalle = estadoproPedidodetalle;
    }

    public Pedido getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(Pedido codPedido) {
        this.codPedido = codPedido;
    }

    public Producto getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Producto codProducto) {
        this.codProducto = codProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPedidodetalle != null ? codPedidodetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidodetalle)) {
            return false;
        }
        Pedidodetalle other = (Pedidodetalle) object;
        if ((this.codPedidodetalle == null && other.codPedidodetalle != null) || (this.codPedidodetalle != null && !this.codPedidodetalle.equals(other.codPedidodetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Pedidodetalle[ codPedidodetalle=" + codPedidodetalle + " ]";
    }
    
}
