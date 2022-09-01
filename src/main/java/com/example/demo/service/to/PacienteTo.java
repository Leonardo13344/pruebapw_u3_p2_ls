package com.example.demo.service.to;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.example.demo.repository.modelo.CitaMedica;

public class PacienteTo extends RepresentationModel<PacienteTo> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String cedula;
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	private String codigo_seguro;
	private String genero;
	private Double estatura;
	private Double peso;
	private List<CitaMedica> citasMedicas;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getCodigo_seguro() {
		return codigo_seguro;
	}
	public void setCodigo_seguro(String codigo_seguro) {
		this.codigo_seguro = codigo_seguro;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Double getEstatura() {
		return estatura;
	}
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}
	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}
	
	

}
