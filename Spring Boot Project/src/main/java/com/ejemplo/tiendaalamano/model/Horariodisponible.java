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
@Table(name = "horariodisponible")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horariodisponible.findAll", query = "SELECT h FROM Horariodisponible h")})
public class Horariodisponible implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_horariodisponible")
    private Integer codHorariodisponible;
    @Basic(optional = false)
    @Column(name = "inicio_horario")
    private String inicioHorario;
    @Basic(optional = false)
    @Column(name = "fin_horario")
    private String finHorario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codHorariodisponible", fetch = FetchType.EAGER)
    private List<Pedido> pedidoList;

    public Horariodisponible() {
    }

    public Horariodisponible(Integer codHorariodisponible) {
        this.codHorariodisponible = codHorariodisponible;
    }

    public Horariodisponible(Integer codHorariodisponible, String inicioHorario, String finHorario) {
        this.codHorariodisponible = codHorariodisponible;
        this.inicioHorario = inicioHorario;
        this.finHorario = finHorario;
    }

    public Integer getCodHorariodisponible() {
        return codHorariodisponible;
    }

    public void setCodHorariodisponible(Integer codHorariodisponible) {
        this.codHorariodisponible = codHorariodisponible;
    }

    public String getInicioHorario() {
        return inicioHorario;
    }

    public void setInicioHorario(String inicioHorario) {
        this.inicioHorario = inicioHorario;
    }

    public String getFinHorario() {
        return finHorario;
    }

    public void setFinHorario(String finHorario) {
        this.finHorario = finHorario;
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
        hash += (codHorariodisponible != null ? codHorariodisponible.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horariodisponible)) {
            return false;
        }
        Horariodisponible other = (Horariodisponible) object;
        if ((this.codHorariodisponible == null && other.codHorariodisponible != null) || (this.codHorariodisponible != null && !this.codHorariodisponible.equals(other.codHorariodisponible))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Horariodisponible[ codHorariodisponible=" + codHorariodisponible + " ]";
    }
    
}
