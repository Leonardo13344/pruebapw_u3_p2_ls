package com.example.demo.service.to;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.example.demo.repository.modelo.CitaMedica;

public class DoctorTo extends RepresentationModel<DoctorTo> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String cedula;
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	private Integer codigo_senescyt;
	private String genero;
	List<CitaMedica> citasMedicas;
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
	public Integer getCodigo_senescyt() {
		return codigo_senescyt;
	}
	public void setCodigo_senescyt(Integer codigo_senescyt) {
		this.codigo_senescyt = codigo_senescyt;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}
	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}

}
