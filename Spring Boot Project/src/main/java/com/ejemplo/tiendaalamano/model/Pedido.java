/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_pedido")
    private Integer codPedido;
    @Basic(optional = false)
    @Column(name = "fecha_pedido")
    @Temporal(TemporalType.DATE)
    private Date fechaPedido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total_pedido")
    private BigDecimal totalPedido;
    @Basic(optional = false)
    @Column(name = "descuentos_pedido")
    private BigDecimal descuentosPedido;
    @Basic(optional = false)
    @Column(name = "puntos_pedidop")
    private int puntosPedidop;
    @Basic(optional = false)
    @Column(name = "estado_pedido")
    private short estadoPedido;
    @Basic(optional = false)
    @Column(name = "calificacion_pedido")
    private short calificacionPedido;
    @Basic(optional = false)
    @Column(name = "costoenvio_pedido")
    private BigDecimal costoenvioPedido;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPedido", fetch = FetchType.EAGER)
//    private List<Pedidodetalle> pedidodetalleList;
//    @OneToMany(mappedBy = "codPedido", fetch = FetchType.EAGER)
//    private List<Pqr> pqrList;
    @JoinColumn(name = "cod_formapago", referencedColumnName = "cod_formapago")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Formapago codFormapago;
    @JoinColumn(name = "cod_puntoventa", referencedColumnName = "cod_puntoventa")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Puntoventa codPuntoventa;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario codUsuario;
    @JoinColumn(name = "cod_horariodisponible", referencedColumnName = "cod_horariodisponible")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Horariodisponible codHorariodisponible;

    public Pedido() {
    }

    public Pedido(Integer codPedido) {
        this.codPedido = codPedido;
    }

    public Pedido(Integer codPedido, Date fechaPedido, BigDecimal totalPedido, BigDecimal descuentosPedido, int puntosPedidop, short estadoPedido, short calificacionPedido, BigDecimal costoenvioPedido) {
        this.codPedido = codPedido;
        this.fechaPedido = fechaPedido;
        this.totalPedido = totalPedido;
        this.descuentosPedido = descuentosPedido;
        this.puntosPedidop = puntosPedidop;
        this.estadoPedido = estadoPedido;
        this.calificacionPedido = calificacionPedido;
        this.costoenvioPedido = costoenvioPedido;
    }

    public Integer getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(Integer codPedido) {
        this.codPedido = codPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }

    public BigDecimal getDescuentosPedido() {
        return descuentosPedido;
    }

    public void setDescuentosPedido(BigDecimal descuentosPedido) {
        this.descuentosPedido = descuentosPedido;
    }

    public int getPuntosPedidop() {
        return puntosPedidop;
    }

    public void setPuntosPedidop(int puntosPedidop) {
        this.puntosPedidop = puntosPedidop;
    }

    public short getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(short estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public short getCalificacionPedido() {
        return calificacionPedido;
    }

    public void setCalificacionPedido(short calificacionPedido) {
        this.calificacionPedido = calificacionPedido;
    }

    public BigDecimal getCostoenvioPedido() {
        return costoenvioPedido;
    }

    public void setCostoenvioPedido(BigDecimal costoenvioPedido) {
        this.costoenvioPedido = costoenvioPedido;
    }

//    @XmlTransient
//    public List<Pedidodetalle> getPedidodetalleList() {
//        return pedidodetalleList;
//    }
//
//    public void setPedidodetalleList(List<Pedidodetalle> pedidodetalleList) {
//        this.pedidodetalleList = pedidodetalleList;
//    }

//    @XmlTransient
//    public List<Pqr> getPqrList() {
//        return pqrList;
//    }
//
//    public void setPqrList(List<Pqr> pqrList) {
//        this.pqrList = pqrList;
//    }

    public Formapago getCodFormapago() {
        return codFormapago;
    }

    public void setCodFormapago(Formapago codFormapago) {
        this.codFormapago = codFormapago;
    }

    public Puntoventa getCodPuntoventa() {
        return codPuntoventa;
    }

    public void setCodPuntoventa(Puntoventa codPuntoventa) {
        this.codPuntoventa = codPuntoventa;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Horariodisponible getCodHorariodisponible() {
        return codHorariodisponible;
    }

    public void setCodHorariodisponible(Horariodisponible codHorariodisponible) {
        this.codHorariodisponible = codHorariodisponible;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPedido != null ? codPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.codPedido == null && other.codPedido != null) || (this.codPedido != null && !this.codPedido.equals(other.codPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Pedido[ codPedido=" + codPedido + " ]";
    }
    
}
