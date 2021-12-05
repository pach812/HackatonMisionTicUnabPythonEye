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
@Table(name = "cupones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cupones.findAll", query = "SELECT c FROM Cupones c")})
public class Cupones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_cupon")
    private Integer codCupon;
    @Basic(optional = false)
    @Column(name = "descuento_cupon")
    private String descuentoCupon;
    @Basic(optional = false)
    @Column(name = "categoria_cupon")
    private String categoriaCupon;
    @Basic(optional = false)
    @Column(name = "estado_cupon")
    private String estadoCupon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCupon", fetch = FetchType.EAGER)
    private List<Producto> productoList;

    public Cupones() {
    }

    public Cupones(Integer codCupon) {
        this.codCupon = codCupon;
    }

    public Cupones(Integer codCupon, String descuentoCupon, String categoriaCupon, String estadoCupon) {
        this.codCupon = codCupon;
        this.descuentoCupon = descuentoCupon;
        this.categoriaCupon = categoriaCupon;
        this.estadoCupon = estadoCupon;
    }

    public Integer getCodCupon() {
        return codCupon;
    }

    public void setCodCupon(Integer codCupon) {
        this.codCupon = codCupon;
    }

    public String getDescuentoCupon() {
        return descuentoCupon;
    }

    public void setDescuentoCupon(String descuentoCupon) {
        this.descuentoCupon = descuentoCupon;
    }

    public String getCategoriaCupon() {
        return categoriaCupon;
    }

    public void setCategoriaCupon(String categoriaCupon) {
        this.categoriaCupon = categoriaCupon;
    }

    public String getEstadoCupon() {
        return estadoCupon;
    }

    public void setEstadoCupon(String estadoCupon) {
        this.estadoCupon = estadoCupon;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCupon != null ? codCupon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cupones)) {
            return false;
        }
        Cupones other = (Cupones) object;
        if ((this.codCupon == null && other.codCupon != null) || (this.codCupon != null && !this.codCupon.equals(other.codCupon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Cupones[ codCupon=" + codCupon + " ]";
    }
    
}
