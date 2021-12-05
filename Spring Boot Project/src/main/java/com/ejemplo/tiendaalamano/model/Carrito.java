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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Edinson
 */
@Entity
@Table(name = "carrito")

public class Carrito implements Serializable{

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_carrito")
    private Integer codCarrito;
    @Basic(optional = false)
    @Column(name = "cantidad_producto")
    private short cantidadProducto;
    
    @ManyToOne
    @JoinColumn(name = "cod_usuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "cod_producto")
    private Producto producto;

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

    
    
}