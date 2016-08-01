/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dto;

import com.tsp.gespro.dao.*;
import com.tsp.gespro.factory.*;
import com.tsp.gespro.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class Cliente implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CLIENTE in the cliente table.
	 */
	protected int idCliente;

	/** 
	 * This attribute represents whether the attribute idCliente has been modified since being read from the database.
	 */
	protected boolean idClienteModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the cliente table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_CATEGORIA in the cliente table.
	 */
	protected int idCategoria;

	/** 
	 * This attribute represents whether the attribute idCategoria has been modified since being read from the database.
	 */
	protected boolean idCategoriaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the cliente table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the primitive attribute idEstatus is null.
	 */
	protected boolean idEstatusNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_COMERCIAL in the cliente table.
	 */
	protected String nombreComercial;

	/** 
	 * This attribute represents whether the attribute nombreComercial has been modified since being read from the database.
	 */
	protected boolean nombreComercialModified = false;

	/** 
	 * This attribute maps to the column CONTACTO in the cliente table.
	 */
	protected String contacto;

	/** 
	 * This attribute represents whether the attribute contacto has been modified since being read from the database.
	 */
	protected boolean contactoModified = false;

	/** 
	 * This attribute maps to the column TELEFONO in the cliente table.
	 */
	protected String telefono;

	/** 
	 * This attribute represents whether the attribute telefono has been modified since being read from the database.
	 */
	protected boolean telefonoModified = false;

	/** 
	 * This attribute maps to the column CALLE in the cliente table.
	 */
	protected String calle;

	/** 
	 * This attribute represents whether the attribute calle has been modified since being read from the database.
	 */
	protected boolean calleModified = false;

	/** 
	 * This attribute maps to the column NUMERO in the cliente table.
	 */
	protected String numero;

	/** 
	 * This attribute represents whether the attribute numero has been modified since being read from the database.
	 */
	protected boolean numeroModified = false;

	/** 
	 * This attribute maps to the column NUMERO_INTERIOR in the cliente table.
	 */
	protected String numeroInterior;

	/** 
	 * This attribute represents whether the attribute numeroInterior has been modified since being read from the database.
	 */
	protected boolean numeroInteriorModified = false;

	/** 
	 * This attribute maps to the column COLONIA in the cliente table.
	 */
	protected String colonia;

	/** 
	 * This attribute represents whether the attribute colonia has been modified since being read from the database.
	 */
	protected boolean coloniaModified = false;

	/** 
	 * This attribute maps to the column CODIGO_POSTAL in the cliente table.
	 */
	protected String codigoPostal;

	/** 
	 * This attribute represents whether the attribute codigoPostal has been modified since being read from the database.
	 */
	protected boolean codigoPostalModified = false;

	/** 
	 * This attribute maps to the column PAIS in the cliente table.
	 */
	protected String pais;

	/** 
	 * This attribute represents whether the attribute pais has been modified since being read from the database.
	 */
	protected boolean paisModified = false;

	/** 
	 * This attribute maps to the column ESTADO in the cliente table.
	 */
	protected String estado;

	/** 
	 * This attribute represents whether the attribute estado has been modified since being read from the database.
	 */
	protected boolean estadoModified = false;

	/** 
	 * This attribute maps to the column MUNICIPIO in the cliente table.
	 */
	protected String municipio;

	/** 
	 * This attribute represents whether the attribute municipio has been modified since being read from the database.
	 */
	protected boolean municipioModified = false;

	/** 
	 * This attribute maps to the column CORREO in the cliente table.
	 */
	protected String correo;

	/** 
	 * This attribute represents whether the attribute correo has been modified since being read from the database.
	 */
	protected boolean correoModified = false;

	/** 
	 * This attribute maps to the column LATITUD in the cliente table.
	 */
	protected double latitud;

	/** 
	 * This attribute represents whether the primitive attribute latitud is null.
	 */
	protected boolean latitudNull = true;

	/** 
	 * This attribute represents whether the attribute latitud has been modified since being read from the database.
	 */
	protected boolean latitudModified = false;

	/** 
	 * This attribute maps to the column LONGITUD in the cliente table.
	 */
	protected double longitud;

	/** 
	 * This attribute represents whether the primitive attribute longitud is null.
	 */
	protected boolean longitudNull = true;

	/** 
	 * This attribute represents whether the attribute longitud has been modified since being read from the database.
	 */
	protected boolean longitudModified = false;

	/** 
	 * This attribute maps to the column FECHA_REGISTRO in the cliente table.
	 */
	protected Date fechaRegistro;

	/** 
	 * This attribute represents whether the attribute fechaRegistro has been modified since being read from the database.
	 */
	protected boolean fechaRegistroModified = false;

	/** 
	 * This attribute maps to the column ID_USUARIO_ALTA in the cliente table.
	 */
	protected int idUsuarioAlta;

	/** 
	 * This attribute represents whether the primitive attribute idUsuarioAlta is null.
	 */
	protected boolean idUsuarioAltaNull = true;

	/** 
	 * This attribute represents whether the attribute idUsuarioAlta has been modified since being read from the database.
	 */
	protected boolean idUsuarioAltaModified = false;

	/**
	 * Method 'Cliente'
	 * 
	 */
	public Cliente()
	{
	}

	/**
	 * Method 'getIdCliente'
	 * 
	 * @return int
	 */
	public int getIdCliente()
	{
		return idCliente;
	}

	/**
	 * Method 'setIdCliente'
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(int idCliente)
	{
		this.idCliente = idCliente;
		this.idClienteModified = true;
	}

	/** 
	 * Sets the value of idClienteModified
	 */
	public void setIdClienteModified(boolean idClienteModified)
	{
		this.idClienteModified = idClienteModified;
	}

	/** 
	 * Gets the value of idClienteModified
	 */
	public boolean isIdClienteModified()
	{
		return idClienteModified;
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
		this.idEmpresaModified = true;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
	}

	/**
	 * Method 'getIdCategoria'
	 * 
	 * @return int
	 */
	public int getIdCategoria()
	{
		return idCategoria;
	}

	/**
	 * Method 'setIdCategoria'
	 * 
	 * @param idCategoria
	 */
	public void setIdCategoria(int idCategoria)
	{
		this.idCategoria = idCategoria;
		this.idCategoriaModified = true;
	}

	/** 
	 * Sets the value of idCategoriaModified
	 */
	public void setIdCategoriaModified(boolean idCategoriaModified)
	{
		this.idCategoriaModified = idCategoriaModified;
	}

	/** 
	 * Gets the value of idCategoriaModified
	 */
	public boolean isIdCategoriaModified()
	{
		return idCategoriaModified;
	}

	/**
	 * Method 'getIdEstatus'
	 * 
	 * @return int
	 */
	public int getIdEstatus()
	{
		return idEstatus;
	}

	/**
	 * Method 'setIdEstatus'
	 * 
	 * @param idEstatus
	 */
	public void setIdEstatus(int idEstatus)
	{
		this.idEstatus = idEstatus;
		this.idEstatusNull = false;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'setIdEstatusNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusNull(boolean value)
	{
		this.idEstatusNull = value;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'isIdEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusNull()
	{
		return idEstatusNull;
	}

	/** 
	 * Sets the value of idEstatusModified
	 */
	public void setIdEstatusModified(boolean idEstatusModified)
	{
		this.idEstatusModified = idEstatusModified;
	}

	/** 
	 * Gets the value of idEstatusModified
	 */
	public boolean isIdEstatusModified()
	{
		return idEstatusModified;
	}

	/**
	 * Method 'getNombreComercial'
	 * 
	 * @return String
	 */
	public String getNombreComercial()
	{
		return nombreComercial;
	}

	/**
	 * Method 'setNombreComercial'
	 * 
	 * @param nombreComercial
	 */
	public void setNombreComercial(String nombreComercial)
	{
		this.nombreComercial = nombreComercial;
		this.nombreComercialModified = true;
	}

	/** 
	 * Sets the value of nombreComercialModified
	 */
	public void setNombreComercialModified(boolean nombreComercialModified)
	{
		this.nombreComercialModified = nombreComercialModified;
	}

	/** 
	 * Gets the value of nombreComercialModified
	 */
	public boolean isNombreComercialModified()
	{
		return nombreComercialModified;
	}

	/**
	 * Method 'getContacto'
	 * 
	 * @return String
	 */
	public String getContacto()
	{
		return contacto;
	}

	/**
	 * Method 'setContacto'
	 * 
	 * @param contacto
	 */
	public void setContacto(String contacto)
	{
		this.contacto = contacto;
		this.contactoModified = true;
	}

	/** 
	 * Sets the value of contactoModified
	 */
	public void setContactoModified(boolean contactoModified)
	{
		this.contactoModified = contactoModified;
	}

	/** 
	 * Gets the value of contactoModified
	 */
	public boolean isContactoModified()
	{
		return contactoModified;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
		this.telefonoModified = true;
	}

	/** 
	 * Sets the value of telefonoModified
	 */
	public void setTelefonoModified(boolean telefonoModified)
	{
		this.telefonoModified = telefonoModified;
	}

	/** 
	 * Gets the value of telefonoModified
	 */
	public boolean isTelefonoModified()
	{
		return telefonoModified;
	}

	/**
	 * Method 'getCalle'
	 * 
	 * @return String
	 */
	public String getCalle()
	{
		return calle;
	}

	/**
	 * Method 'setCalle'
	 * 
	 * @param calle
	 */
	public void setCalle(String calle)
	{
		this.calle = calle;
		this.calleModified = true;
	}

	/** 
	 * Sets the value of calleModified
	 */
	public void setCalleModified(boolean calleModified)
	{
		this.calleModified = calleModified;
	}

	/** 
	 * Gets the value of calleModified
	 */
	public boolean isCalleModified()
	{
		return calleModified;
	}

	/**
	 * Method 'getNumero'
	 * 
	 * @return String
	 */
	public String getNumero()
	{
		return numero;
	}

	/**
	 * Method 'setNumero'
	 * 
	 * @param numero
	 */
	public void setNumero(String numero)
	{
		this.numero = numero;
		this.numeroModified = true;
	}

	/** 
	 * Sets the value of numeroModified
	 */
	public void setNumeroModified(boolean numeroModified)
	{
		this.numeroModified = numeroModified;
	}

	/** 
	 * Gets the value of numeroModified
	 */
	public boolean isNumeroModified()
	{
		return numeroModified;
	}

	/**
	 * Method 'getNumeroInterior'
	 * 
	 * @return String
	 */
	public String getNumeroInterior()
	{
		return numeroInterior;
	}

	/**
	 * Method 'setNumeroInterior'
	 * 
	 * @param numeroInterior
	 */
	public void setNumeroInterior(String numeroInterior)
	{
		this.numeroInterior = numeroInterior;
		this.numeroInteriorModified = true;
	}

	/** 
	 * Sets the value of numeroInteriorModified
	 */
	public void setNumeroInteriorModified(boolean numeroInteriorModified)
	{
		this.numeroInteriorModified = numeroInteriorModified;
	}

	/** 
	 * Gets the value of numeroInteriorModified
	 */
	public boolean isNumeroInteriorModified()
	{
		return numeroInteriorModified;
	}

	/**
	 * Method 'getColonia'
	 * 
	 * @return String
	 */
	public String getColonia()
	{
		return colonia;
	}

	/**
	 * Method 'setColonia'
	 * 
	 * @param colonia
	 */
	public void setColonia(String colonia)
	{
		this.colonia = colonia;
		this.coloniaModified = true;
	}

	/** 
	 * Sets the value of coloniaModified
	 */
	public void setColoniaModified(boolean coloniaModified)
	{
		this.coloniaModified = coloniaModified;
	}

	/** 
	 * Gets the value of coloniaModified
	 */
	public boolean isColoniaModified()
	{
		return coloniaModified;
	}

	/**
	 * Method 'getCodigoPostal'
	 * 
	 * @return String
	 */
	public String getCodigoPostal()
	{
		return codigoPostal;
	}

	/**
	 * Method 'setCodigoPostal'
	 * 
	 * @param codigoPostal
	 */
	public void setCodigoPostal(String codigoPostal)
	{
		this.codigoPostal = codigoPostal;
		this.codigoPostalModified = true;
	}

	/** 
	 * Sets the value of codigoPostalModified
	 */
	public void setCodigoPostalModified(boolean codigoPostalModified)
	{
		this.codigoPostalModified = codigoPostalModified;
	}

	/** 
	 * Gets the value of codigoPostalModified
	 */
	public boolean isCodigoPostalModified()
	{
		return codigoPostalModified;
	}

	/**
	 * Method 'getPais'
	 * 
	 * @return String
	 */
	public String getPais()
	{
		return pais;
	}

	/**
	 * Method 'setPais'
	 * 
	 * @param pais
	 */
	public void setPais(String pais)
	{
		this.pais = pais;
		this.paisModified = true;
	}

	/** 
	 * Sets the value of paisModified
	 */
	public void setPaisModified(boolean paisModified)
	{
		this.paisModified = paisModified;
	}

	/** 
	 * Gets the value of paisModified
	 */
	public boolean isPaisModified()
	{
		return paisModified;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return String
	 */
	public String getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(String estado)
	{
		this.estado = estado;
		this.estadoModified = true;
	}

	/** 
	 * Sets the value of estadoModified
	 */
	public void setEstadoModified(boolean estadoModified)
	{
		this.estadoModified = estadoModified;
	}

	/** 
	 * Gets the value of estadoModified
	 */
	public boolean isEstadoModified()
	{
		return estadoModified;
	}

	/**
	 * Method 'getMunicipio'
	 * 
	 * @return String
	 */
	public String getMunicipio()
	{
		return municipio;
	}

	/**
	 * Method 'setMunicipio'
	 * 
	 * @param municipio
	 */
	public void setMunicipio(String municipio)
	{
		this.municipio = municipio;
		this.municipioModified = true;
	}

	/** 
	 * Sets the value of municipioModified
	 */
	public void setMunicipioModified(boolean municipioModified)
	{
		this.municipioModified = municipioModified;
	}

	/** 
	 * Gets the value of municipioModified
	 */
	public boolean isMunicipioModified()
	{
		return municipioModified;
	}

	/**
	 * Method 'getCorreo'
	 * 
	 * @return String
	 */
	public String getCorreo()
	{
		return correo;
	}

	/**
	 * Method 'setCorreo'
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo)
	{
		this.correo = correo;
		this.correoModified = true;
	}

	/** 
	 * Sets the value of correoModified
	 */
	public void setCorreoModified(boolean correoModified)
	{
		this.correoModified = correoModified;
	}

	/** 
	 * Gets the value of correoModified
	 */
	public boolean isCorreoModified()
	{
		return correoModified;
	}

	/**
	 * Method 'getLatitud'
	 * 
	 * @return double
	 */
	public double getLatitud()
	{
		return latitud;
	}

	/**
	 * Method 'setLatitud'
	 * 
	 * @param latitud
	 */
	public void setLatitud(double latitud)
	{
		this.latitud = latitud;
		this.latitudNull = false;
		this.latitudModified = true;
	}

	/**
	 * Method 'setLatitudNull'
	 * 
	 * @param value
	 */
	public void setLatitudNull(boolean value)
	{
		this.latitudNull = value;
		this.latitudModified = true;
	}

	/**
	 * Method 'isLatitudNull'
	 * 
	 * @return boolean
	 */
	public boolean isLatitudNull()
	{
		return latitudNull;
	}

	/** 
	 * Sets the value of latitudModified
	 */
	public void setLatitudModified(boolean latitudModified)
	{
		this.latitudModified = latitudModified;
	}

	/** 
	 * Gets the value of latitudModified
	 */
	public boolean isLatitudModified()
	{
		return latitudModified;
	}

	/**
	 * Method 'getLongitud'
	 * 
	 * @return double
	 */
	public double getLongitud()
	{
		return longitud;
	}

	/**
	 * Method 'setLongitud'
	 * 
	 * @param longitud
	 */
	public void setLongitud(double longitud)
	{
		this.longitud = longitud;
		this.longitudNull = false;
		this.longitudModified = true;
	}

	/**
	 * Method 'setLongitudNull'
	 * 
	 * @param value
	 */
	public void setLongitudNull(boolean value)
	{
		this.longitudNull = value;
		this.longitudModified = true;
	}

	/**
	 * Method 'isLongitudNull'
	 * 
	 * @return boolean
	 */
	public boolean isLongitudNull()
	{
		return longitudNull;
	}

	/** 
	 * Sets the value of longitudModified
	 */
	public void setLongitudModified(boolean longitudModified)
	{
		this.longitudModified = longitudModified;
	}

	/** 
	 * Gets the value of longitudModified
	 */
	public boolean isLongitudModified()
	{
		return longitudModified;
	}

	/**
	 * Method 'getFechaRegistro'
	 * 
	 * @return Date
	 */
	public Date getFechaRegistro()
	{
		return fechaRegistro;
	}

	/**
	 * Method 'setFechaRegistro'
	 * 
	 * @param fechaRegistro
	 */
	public void setFechaRegistro(Date fechaRegistro)
	{
		this.fechaRegistro = fechaRegistro;
		this.fechaRegistroModified = true;
	}

	/** 
	 * Sets the value of fechaRegistroModified
	 */
	public void setFechaRegistroModified(boolean fechaRegistroModified)
	{
		this.fechaRegistroModified = fechaRegistroModified;
	}

	/** 
	 * Gets the value of fechaRegistroModified
	 */
	public boolean isFechaRegistroModified()
	{
		return fechaRegistroModified;
	}

	/**
	 * Method 'getIdUsuarioAlta'
	 * 
	 * @return int
	 */
	public int getIdUsuarioAlta()
	{
		return idUsuarioAlta;
	}

	/**
	 * Method 'setIdUsuarioAlta'
	 * 
	 * @param idUsuarioAlta
	 */
	public void setIdUsuarioAlta(int idUsuarioAlta)
	{
		this.idUsuarioAlta = idUsuarioAlta;
		this.idUsuarioAltaNull = false;
		this.idUsuarioAltaModified = true;
	}

	/**
	 * Method 'setIdUsuarioAltaNull'
	 * 
	 * @param value
	 */
	public void setIdUsuarioAltaNull(boolean value)
	{
		this.idUsuarioAltaNull = value;
		this.idUsuarioAltaModified = true;
	}

	/**
	 * Method 'isIdUsuarioAltaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdUsuarioAltaNull()
	{
		return idUsuarioAltaNull;
	}

	/** 
	 * Sets the value of idUsuarioAltaModified
	 */
	public void setIdUsuarioAltaModified(boolean idUsuarioAltaModified)
	{
		this.idUsuarioAltaModified = idUsuarioAltaModified;
	}

	/** 
	 * Gets the value of idUsuarioAltaModified
	 */
	public boolean isIdUsuarioAltaModified()
	{
		return idUsuarioAltaModified;
	}
        
	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Cliente)) {
			return false;
		}
		
		final Cliente _cast = (Cliente) _other;
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idClienteModified != _cast.idClienteModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idCategoria != _cast.idCategoria) {
			return false;
		}
		
		if (idCategoriaModified != _cast.idCategoriaModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusNull != _cast.idEstatusNull) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (nombreComercial == null ? _cast.nombreComercial != nombreComercial : !nombreComercial.equals( _cast.nombreComercial )) {
			return false;
		}
		
		if (nombreComercialModified != _cast.nombreComercialModified) {
			return false;
		}
		
		if (contacto == null ? _cast.contacto != contacto : !contacto.equals( _cast.contacto )) {
			return false;
		}
		
		if (contactoModified != _cast.contactoModified) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		if (telefonoModified != _cast.telefonoModified) {
			return false;
		}
		
		if (calle == null ? _cast.calle != calle : !calle.equals( _cast.calle )) {
			return false;
		}
		
		if (calleModified != _cast.calleModified) {
			return false;
		}
		
		if (numero == null ? _cast.numero != numero : !numero.equals( _cast.numero )) {
			return false;
		}
		
		if (numeroModified != _cast.numeroModified) {
			return false;
		}
		
		if (numeroInterior == null ? _cast.numeroInterior != numeroInterior : !numeroInterior.equals( _cast.numeroInterior )) {
			return false;
		}
		
		if (numeroInteriorModified != _cast.numeroInteriorModified) {
			return false;
		}
		
		if (colonia == null ? _cast.colonia != colonia : !colonia.equals( _cast.colonia )) {
			return false;
		}
		
		if (coloniaModified != _cast.coloniaModified) {
			return false;
		}
		
		if (codigoPostal == null ? _cast.codigoPostal != codigoPostal : !codigoPostal.equals( _cast.codigoPostal )) {
			return false;
		}
		
		if (codigoPostalModified != _cast.codigoPostalModified) {
			return false;
		}
		
		if (pais == null ? _cast.pais != pais : !pais.equals( _cast.pais )) {
			return false;
		}
		
		if (paisModified != _cast.paisModified) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
			return false;
		}
		
		if (estadoModified != _cast.estadoModified) {
			return false;
		}
		
		if (municipio == null ? _cast.municipio != municipio : !municipio.equals( _cast.municipio )) {
			return false;
		}
		
		if (municipioModified != _cast.municipioModified) {
			return false;
		}
		
		if (correo == null ? _cast.correo != correo : !correo.equals( _cast.correo )) {
			return false;
		}
		
		if (correoModified != _cast.correoModified) {
			return false;
		}
		
		if (latitud != _cast.latitud) {
			return false;
		}
		
		if (latitudNull != _cast.latitudNull) {
			return false;
		}
		
		if (latitudModified != _cast.latitudModified) {
			return false;
		}
		
		if (longitud != _cast.longitud) {
			return false;
		}
		
		if (longitudNull != _cast.longitudNull) {
			return false;
		}
		
		if (longitudModified != _cast.longitudModified) {
			return false;
		}
		
		if (fechaRegistro == null ? _cast.fechaRegistro != fechaRegistro : !fechaRegistro.equals( _cast.fechaRegistro )) {
			return false;
		}
		
		if (fechaRegistroModified != _cast.fechaRegistroModified) {
			return false;
		}
		
		if (idUsuarioAlta != _cast.idUsuarioAlta) {
			return false;
		}
		
		if (idUsuarioAltaNull != _cast.idUsuarioAltaNull) {
			return false;
		}
		
		if (idUsuarioAltaModified != _cast.idUsuarioAltaModified) {
			return false;
		}
                
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + (idClienteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCategoria;
		_hashCode = 29 * _hashCode + (idCategoriaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		if (nombreComercial != null) {
			_hashCode = 29 * _hashCode + nombreComercial.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreComercialModified ? 1 : 0);
		if (contacto != null) {
			_hashCode = 29 * _hashCode + contacto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (contactoModified ? 1 : 0);
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (telefonoModified ? 1 : 0);
		if (calle != null) {
			_hashCode = 29 * _hashCode + calle.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (calleModified ? 1 : 0);
		if (numero != null) {
			_hashCode = 29 * _hashCode + numero.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroModified ? 1 : 0);
		if (numeroInterior != null) {
			_hashCode = 29 * _hashCode + numeroInterior.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroInteriorModified ? 1 : 0);
		if (colonia != null) {
			_hashCode = 29 * _hashCode + colonia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (coloniaModified ? 1 : 0);
		if (codigoPostal != null) {
			_hashCode = 29 * _hashCode + codigoPostal.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (codigoPostalModified ? 1 : 0);
		if (pais != null) {
			_hashCode = 29 * _hashCode + pais.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (paisModified ? 1 : 0);
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (estadoModified ? 1 : 0);
		if (municipio != null) {
			_hashCode = 29 * _hashCode + municipio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (municipioModified ? 1 : 0);
		if (correo != null) {
			_hashCode = 29 * _hashCode + correo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (correoModified ? 1 : 0);
		long temp_latitud = Double.doubleToLongBits(latitud);
		_hashCode = 29 * _hashCode + (int) (temp_latitud ^ (temp_latitud >>> 32));
		_hashCode = 29 * _hashCode + (latitudNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (latitudModified ? 1 : 0);
		long temp_longitud = Double.doubleToLongBits(longitud);
		_hashCode = 29 * _hashCode + (int) (temp_longitud ^ (temp_longitud >>> 32));
		_hashCode = 29 * _hashCode + (longitudNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (longitudModified ? 1 : 0);
		if (fechaRegistro != null) {
			_hashCode = 29 * _hashCode + fechaRegistro.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaRegistroModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuarioAlta;
		_hashCode = 29 * _hashCode + (idUsuarioAltaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idUsuarioAltaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ClientePk
	 */
	public ClientePk createPk()
	{
		return new ClientePk(idCliente);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.gespro.dto.Cliente: " );
		ret.append( "idCliente=" + idCliente );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idCategoria=" + idCategoria );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", nombreComercial=" + nombreComercial );
		ret.append( ", contacto=" + contacto );
		ret.append( ", telefono=" + telefono );
		ret.append( ", calle=" + calle );
		ret.append( ", numero=" + numero );
		ret.append( ", numeroInterior=" + numeroInterior );
		ret.append( ", colonia=" + colonia );
		ret.append( ", codigoPostal=" + codigoPostal );
		ret.append( ", pais=" + pais );
		ret.append( ", estado=" + estado );
		ret.append( ", municipio=" + municipio );
		ret.append( ", correo=" + correo );
		ret.append( ", latitud=" + latitud );
		ret.append( ", longitud=" + longitud );
		ret.append( ", fechaRegistro=" + fechaRegistro );
		ret.append( ", idUsuarioAlta=" + idUsuarioAlta );
		return ret.toString();
	}

}
