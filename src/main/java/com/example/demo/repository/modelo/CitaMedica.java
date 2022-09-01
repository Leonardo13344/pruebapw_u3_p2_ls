package com.example.demo.repository.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="cita_medica")
public class CitaMedica implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cime_id")
	private Integer id;
	
	@Column(name = "cime_numero_cita")
	private Integer numeroCita;
	
	@Column(name = "cime_fecha_cita")
	private LocalDate fechaCita;
	
	@Column(name = "cime_valor_cita")
	private Double valorCita;
	
	@Column(name = "cime_lugar_cita")
	private String lugarCita;
	
	@Column(name = "cime_diagnostico")
	private String diagnostico;
	
	@Column(name = "cime_receta")
	private String receta;
	
	@Column(name = "cime_fecha_proxima_cita")
	private String fechaProxCita;
	
	@ManyToOne
	@JoinColumn(name = "cime_id_paci")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "cime_id_doct")
	private Doctor doctor;

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
