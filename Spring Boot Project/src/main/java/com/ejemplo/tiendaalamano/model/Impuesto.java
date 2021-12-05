/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "impuesto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Impuesto.findAll", query = "SELECT i FROM Impuesto i")})
public class Impuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_impuesto")
    private Integer codImpuesto;
    @Basic(optional = false)
    @Column(name = "nombre_impuesto")
    private String nombreImpuesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio_impuesto")
    private BigDecimal precioImpuesto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codImpuesto", fetch = FetchType.EAGER)
    private List<Producto> productoList;

    public Impuesto() {
    }

    public Impuesto(Integer codImpuesto) {
        this.codImpuesto = codImpuesto;
    }

    public Impuesto(Integer codImpuesto, String nombreImpuesto, BigDecimal precioImpuesto) {
        this.codImpuesto = codImpuesto;
        this.nombreImpuesto = nombreImpuesto;
        this.precioImpuesto = precioImpuesto;
    }

    public Integer getCodImpuesto() {
        return codImpuesto;
    }

    public void setCodImpuesto(Integer codImpuesto) {
        this.codImpuesto = codImpuesto;
    }

    public String getNombreImpuesto() {
        return nombreImpuesto;
    }

    public void setNombreImpuesto(String nombreImpuesto) {
        this.nombreImpuesto = nombreImpuesto;
    }

    public BigDecimal getPrecioImpuesto() {
        return precioImpuesto;
    }

    public void setPrecioImpuesto(BigDecimal precioImpuesto) {
        this.precioImpuesto = precioImpuesto;
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
        hash += (codImpuesto != null ? codImpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impuesto)) {
            return false;
        }
        Impuesto other = (Impuesto) object;
        if ((this.codImpuesto == null && other.codImpuesto != null) || (this.codImpuesto != null && !this.codImpuesto.equals(other.codImpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Impuesto[ codImpuesto=" + codImpuesto + " ]";
    }
    
}
