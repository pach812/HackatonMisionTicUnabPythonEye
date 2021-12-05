/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "domiciliario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Domiciliario.findAll", query = "SELECT d FROM Domiciliario d")})
public class Domiciliario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_domi")
    private Integer codDomi;
    @Basic(optional = false)
    @Column(name = "nombre__domi")
    private String nombreDomi;
    @Basic(optional = false)
    @Column(name = "celular_domi")
    private String celularDomi;
    @OneToMany(mappedBy = "codDomi", fetch = FetchType.EAGER)
    private List<Envio> envioList;

    public Domiciliario() {
    }

    public Domiciliario(Integer codDomi) {
        this.codDomi = codDomi;
    }

    public Domiciliario(Integer codDomi, String nombreDomi, String celularDomi) {
        this.codDomi = codDomi;
        this.nombreDomi = nombreDomi;
        this.celularDomi = celularDomi;
    }

    public Integer getCodDomi() {
        return codDomi;
    }

    public void setCodDomi(Integer codDomi) {
        this.codDomi = codDomi;
    }

    public String getNombreDomi() {
        return nombreDomi;
    }

    public void setNombreDomi(String nombreDomi) {
        this.nombreDomi = nombreDomi;
    }

    public String getCelularDomi() {
        return celularDomi;
    }

    public void setCelularDomi(String celularDomi) {
        this.celularDomi = celularDomi;
    }

    @XmlTransient
    public List<Envio> getEnvioList() {
        return envioList;
    }

    public void setEnvioList(List<Envio> envioList) {
        this.envioList = envioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDomi != null ? codDomi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Domiciliario)) {
            return false;
        }
        Domiciliario other = (Domiciliario) object;
        if ((this.codDomi == null && other.codDomi != null) || (this.codDomi != null && !this.codDomi.equals(other.codDomi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Domiciliario[ codDomi=" + codDomi + " ]";
    }
    
}
