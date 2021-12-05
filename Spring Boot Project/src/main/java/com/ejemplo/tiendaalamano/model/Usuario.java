/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Edinson
 */
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usuario")
	private Integer codUsuario;
	
	@Column(name = "nombres_usuario")
	private String nombresUsuario;
	
	@Column(name = "apellidos_usuario")
	private String apellidosUsuario;
	
	@Column(name = "documento_usuario")
	private String documentoUsuario;
	
	@Column(name = "estado_usuario")
	private Integer estadoUsuario;

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

	public Integer getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(Integer estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}
	
	
	
}