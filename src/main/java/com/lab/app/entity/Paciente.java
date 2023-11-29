package com.lab.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "paciente")
public class Paciente {
	
	@Id
	private String id;
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String sexo;
    private String telefono;
    private String gmail;
    
    //Hermograma Completo
    private String hemogloninaHB;
    private String hematocritoHct;
    private String globulosBlancos;
    private String plaquetasPlt;
    private String formulaleucocitariaodiferencial;
    private String velocidadsedimentacionglobularVSG;

    // perfil de lipidos
    private String colesteroltotal;
    private String colesteroldelipoproteinasdealtadensidadHDL;
    private String colesteroldelipoproteinasdebajadensidadLDL;
    private String trigliceridos;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getHemogloninaHB() {
		return hemogloninaHB;
	}
	public void setHemogloninaHB(String hemogloninaHB) {
		this.hemogloninaHB = hemogloninaHB;
	}
	public String getHematocritoHct() {
		return hematocritoHct;
	}
	public void setHematocritoHct(String hematocritoHct) {
		this.hematocritoHct = hematocritoHct;
	}
	public String getGlobulosBlancos() {
		return globulosBlancos;
	}
	public void setGlobulosBlancos(String globulosBlancos) {
		this.globulosBlancos = globulosBlancos;
	}
	public String getPlaquetasPlt() {
		return plaquetasPlt;
	}
	public void setPlaquetasPlt(String plaquetasPlt) {
		this.plaquetasPlt = plaquetasPlt;
	}
	public String getFormulaleucocitariaodiferencial() {
		return formulaleucocitariaodiferencial;
	}
	public void setFormulaleucocitariaodiferencial(String formulaleucocitariaodiferencial) {
		this.formulaleucocitariaodiferencial = formulaleucocitariaodiferencial;
	}
	public String getVelocidadsedimentacionglobularVSG() {
		return velocidadsedimentacionglobularVSG;
	}
	public void setVelocidadsedimentacionglobularVSG(String velocidadsedimentacionglobularVSG) {
		this.velocidadsedimentacionglobularVSG = velocidadsedimentacionglobularVSG;
	}
	public String getColesteroltotal() {
		return colesteroltotal;
	}
	public void setColesteroltotal(String colesteroltotal) {
		this.colesteroltotal = colesteroltotal;
	}
	public String getColesteroldelipoproteinasdealtadensidadHDL() {
		return colesteroldelipoproteinasdealtadensidadHDL;
	}
	public void setColesteroldelipoproteinasdealtadensidadHDL(String colesteroldelipoproteinasdealtadensidadHDL) {
		this.colesteroldelipoproteinasdealtadensidadHDL = colesteroldelipoproteinasdealtadensidadHDL;
	}
	public String getColesteroldelipoproteinasdebajadensidadLDL() {
		return colesteroldelipoproteinasdebajadensidadLDL;
	}
	public void setColesteroldelipoproteinasdebajadensidadLDL(String colesteroldelipoproteinasdebajadensidadLDL) {
		this.colesteroldelipoproteinasdebajadensidadLDL = colesteroldelipoproteinasdebajadensidadLDL;
	}
	public String getTrigliceridos() {
		return trigliceridos;
	}
	public void setTrigliceridos(String trigliceridos) {
		this.trigliceridos = trigliceridos;
	}
    
	
}
