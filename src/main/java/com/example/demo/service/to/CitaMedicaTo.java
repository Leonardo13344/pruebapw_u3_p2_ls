package com.example.demo.service.to;

import java.io.Serializable;
import java.time.LocalDate;


import org.springframework.hateoas.RepresentationModel;



public class CitaMedicaTo extends RepresentationModel<CitaMedicaTo> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer numeroCita;
	private LocalDate fechaCita;
	private Double valorCita;
	private String lugarCita;
	private String diagnostico;
	private String receta;
	private String fechaProxCita;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroCita() {
		return numeroCita;
	}
	public void setNumeroCita(Integer numeroCita) {
		this.numeroCita = numeroCita;
	}
	public LocalDate getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}
	public Double getValorCita() {
		return valorCita;
	}
	public void setValorCita(Double valorCita) {
		this.valorCita = valorCita;
	}
	public String getLugarCita() {
		return lugarCita;
	}
	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public String getFechaProxCita() {
		return fechaProxCita;
	}
	public void setFechaProxCita(String fechaProxCita) {
		this.fechaProxCita = fechaProxCita;
	}
	
	
	
	
	

}
