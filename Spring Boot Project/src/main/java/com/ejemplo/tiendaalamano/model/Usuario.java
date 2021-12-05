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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Edinson
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_usuario")
    private Integer codUsuario;
    @Basic(optional = false)
    @Column(name = "nombres_usuario")
    private String nombresUsuario;
    @Basic(optional = false)
    @Column(name = "apellidos_usuario")
    private String apellidosUsuario;
    @Basic(optional = false)
    @Column(name = "documento_usuario")
    private String documentoUsuario;
    @Basic(optional = false)
    @Column(name = "estado_usuario")
    private short estadoUsuario;
//    @OneToMany(mappedBy = "codUsuario", fetch = FetchType.EAGER)
//    private List<Punto> puntoList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario", fetch = FetchType.EAGER)
//    private List<Direccion> direccionList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario", fetch = FetchType.EAGER)
//    private List<Carrito> carritoList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario", fetch = FetchType.EAGER)
//    private List<Pedido> pedidoList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario", fetch = FetchType.EAGER)
//    private List<Cuotascredito> cuotascreditoList;

    // *************************************************************************
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(length = 25, nullable = false)
    private String username;

//    @Column(length = 25, nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // *************************************************************************
    public Usuario() {
    }

    public Usuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Usuario(Integer codUsuario, String nombresUsuario, String apellidosUsuario, String documentoUsuario, short estadoUsuario) {
        this.codUsuario = codUsuario;
        this.nombresUsuario = nombresUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.documentoUsuario = documentoUsuario;
        this.estadoUsuario = estadoUsuario;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNombresUsuario() {
        return nombresUsuario;
    }

    public void setNombresUsuario(String nombresUsuario) {
        this.nombresUsuario = nombresUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(String documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public short getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(short estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

//    @XmlTransient
//    public List<Punto> getPuntoList() {
//        return puntoList;
//    }
//
//    public void setPuntoList(List<Punto> puntoList) {
//        this.puntoList = puntoList;
//    }
//    @XmlTransient
//    public List<Direccion> getDireccionList() {
//        return direccionList;
//    }
//
//    public void setDireccionList(List<Direccion> direccionList) {
//        this.direccionList = direccionList;
//    }
//    @XmlTransient
//    public List<Carrito> getCarritoList() {
//        return carritoList;
//    }
//
//    public void setCarritoList(List<Carrito> carritoList) {
//        this.carritoList = carritoList;
//    }
//    @XmlTransient
//    public List<Pedido> getPedidoList() {
//        return pedidoList;
//    }
//
//    public void setPedidoList(List<Pedido> pedidoList) {
//        this.pedidoList = pedidoList;
//    }
//    @XmlTransient
//    public List<Cuotascredito> getCuotascreditoList() {
//        return cuotascreditoList;
//    }
//
//    public void setCuotascreditoList(List<Cuotascredito> cuotascreditoList) {
//        this.cuotascreditoList = cuotascreditoList;
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Usuario[ codUsuario=" + codUsuario + " ]";
    }

}
