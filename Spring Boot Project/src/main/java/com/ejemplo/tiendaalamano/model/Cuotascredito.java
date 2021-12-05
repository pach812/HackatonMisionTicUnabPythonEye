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
@Table(name = "cuotascredito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuotascredito.findAll", query = "SELECT c FROM Cuotascredito c")})
public class Cuotascredito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_cuotas")
    private Integer codCuotas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @Column(name = "total")
    private BigDecimal total;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario codUsuario;

    public Cuotascredito() {
    }

    public Cuotascredito(Integer codCuotas) {
        this.codCuotas = codCuotas;
    }

    public Cuotascredito(Integer codCuotas, BigDecimal valor, BigDecimal total) {
        this.codCuotas = codCuotas;
        this.valor = valor;
        this.total = total;
    }

    public Integer getCodCuotas() {
        return codCuotas;
    }

    public void setCodCuotas(Integer codCuotas) {
        this.codCuotas = codCuotas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCuotas != null ? codCuotas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuotascredito)) {
            return false;
        }
        Cuotascredito other = (Cuotascredito) object;
        if ((this.codCuotas == null && other.codCuotas != null) || (this.codCuotas != null && !this.codCuotas.equals(other.codCuotas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.tiendaalamano.model.Cuotascredito[ codCuotas=" + codCuotas + " ]";
    }
    
}
