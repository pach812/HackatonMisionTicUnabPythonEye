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
@Table(name = "direccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_direccion")
    private Integer codDireccion;
    @Basic(optional = false)
    @Column(name = "texto_direcion")
    private String textoDirecion;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario codUsuario;
//    @OneToMany(mappedBy = "codDireccion", fetch = FetchType.EAGER)
//    private List<Envio> envioList;

    public Direccion() {
    }

    public Direccion(Integer codDireccion) {
        this.codDireccion = codDireccion;
    }

    public Direccion(Integer codDireccion, String textoDirecion) {
        this.codDireccion = codDireccion;
        this.textoDirecion = textoDirecion;
    }

    public Integer getCodDireccion() {
        return codDireccion;
    }

    public void setCodDireccion(Integer codDireccion) {
        this.codDireccion = codDireccion;
    }

    public String getTextoDirecion() {
        return textoDirecion;
    }

    public void setTextoDirecion(String textoDirecion) {
        this.textoDirecion = textoDirecion;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

//    @XmlTransient
//    public List<Envio> getEnvioList() {
//        return envioList;
//    }
//
//    public void setEnvioList(List<Envio> envioList) {
//        this.envioList = envioList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDireccion != null ? codDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.codDireccion == null && other.codDireccion != null) || (this.codDireccion != null && !this.codDireccion.equals(other.codDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Direccion[ codDireccion=" + codDireccion + " ]";
    }
    
}
