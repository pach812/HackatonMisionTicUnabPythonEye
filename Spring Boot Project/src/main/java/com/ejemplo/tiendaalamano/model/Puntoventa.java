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
@Table(name = "puntoventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puntoventa.findAll", query = "SELECT p FROM Puntoventa p")})
public class Puntoventa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_puntoventa")
    private Integer codPuntoventa;
    @Basic(optional = false)
    @Column(name = "nombre_puntoventa")
    private String nombrePuntoventa;
    @Basic(optional = false)
    @Column(name = "longuitud_puntoventa")
    private String longuitudPuntoventa;
    @Basic(optional = false)
    @Column(name = "latitud_puntoventa")
    private String latitudPuntoventa;
    @Basic(optional = false)
    @Column(name = "ciudad_puntoventa")
    private String ciudadPuntoventa;
    @Basic(optional = false)
    @Column(name = "telefono_puntoventa")
    private String telefonoPuntoventa;
    @Basic(optional = false)
    @Column(name = "correo_puntoventa")
    private String correoPuntoventa;
    @Basic(optional = false)
    @Column(name = "face_puntoventa")
    private String facePuntoventa;
    @Basic(optional = false)
    @Column(name = "instagram_puntoventa")
    private String instagramPuntoventa;
    @Basic(optional = false)
    @Column(name = "whataspp_puntoventa")
    private String whatasppPuntoventa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPuntoventa", fetch = FetchType.EAGER)
    private List<Pedido> pedidoList;

    public Puntoventa() {
    }

    public Puntoventa(Integer codPuntoventa) {
        this.codPuntoventa = codPuntoventa;
    }

    public Puntoventa(Integer codPuntoventa, String nombrePuntoventa, String longuitudPuntoventa, String latitudPuntoventa, String ciudadPuntoventa, String telefonoPuntoventa, String correoPuntoventa, String facePuntoventa, String instagramPuntoventa, String whatasppPuntoventa) {
        this.codPuntoventa = codPuntoventa;
        this.nombrePuntoventa = nombrePuntoventa;
        this.longuitudPuntoventa = longuitudPuntoventa;
        this.latitudPuntoventa = latitudPuntoventa;
        this.ciudadPuntoventa = ciudadPuntoventa;
        this.telefonoPuntoventa = telefonoPuntoventa;
        this.correoPuntoventa = correoPuntoventa;
        this.facePuntoventa = facePuntoventa;
        this.instagramPuntoventa = instagramPuntoventa;
        this.whatasppPuntoventa = whatasppPuntoventa;
    }

    public Integer getCodPuntoventa() {
        return codPuntoventa;
    }

    public void setCodPuntoventa(Integer codPuntoventa) {
        this.codPuntoventa = codPuntoventa;
    }

    public String getNombrePuntoventa() {
        return nombrePuntoventa;
    }

    public void setNombrePuntoventa(String nombrePuntoventa) {
        this.nombrePuntoventa = nombrePuntoventa;
    }

    public String getLonguitudPuntoventa() {
        return longuitudPuntoventa;
    }

    public void setLonguitudPuntoventa(String longuitudPuntoventa) {
        this.longuitudPuntoventa = longuitudPuntoventa;
    }

    public String getLatitudPuntoventa() {
        return latitudPuntoventa;
    }

    public void setLatitudPuntoventa(String latitudPuntoventa) {
        this.latitudPuntoventa = latitudPuntoventa;
    }

    public String getCiudadPuntoventa() {
        return ciudadPuntoventa;
    }

    public void setCiudadPuntoventa(String ciudadPuntoventa) {
        this.ciudadPuntoventa = ciudadPuntoventa;
    }

    public String getTelefonoPuntoventa() {
        return telefonoPuntoventa;
    }

    public void setTelefonoPuntoventa(String telefonoPuntoventa) {
        this.telefonoPuntoventa = telefonoPuntoventa;
    }

    public String getCorreoPuntoventa() {
        return correoPuntoventa;
    }

    public void setCorreoPuntoventa(String correoPuntoventa) {
        this.correoPuntoventa = correoPuntoventa;
    }

    public String getFacePuntoventa() {
        return facePuntoventa;
    }

    public void setFacePuntoventa(String facePuntoventa) {
        this.facePuntoventa = facePuntoventa;
    }

    public String getInstagramPuntoventa() {
        return instagramPuntoventa;
    }

    public void setInstagramPuntoventa(String instagramPuntoventa) {
        this.instagramPuntoventa = instagramPuntoventa;
    }

    public String getWhatasppPuntoventa() {
        return whatasppPuntoventa;
    }

    public void setWhatasppPuntoventa(String whatasppPuntoventa) {
        this.whatasppPuntoventa = whatasppPuntoventa;
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
        hash += (codPuntoventa != null ? codPuntoventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puntoventa)) {
            return false;
        }
        Puntoventa other = (Puntoventa) object;
        if ((this.codPuntoventa == null && other.codPuntoventa != null) || (this.codPuntoventa != null && !this.codPuntoventa.equals(other.codPuntoventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Puntoventa[ codPuntoventa=" + codPuntoventa + " ]";
    }
    
}
