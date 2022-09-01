package com.example.demo.repository.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "paci_id")
	private Integer id;
	
	@Column(name = "paci_cedula")
	private String cedula;
	
	@Column(name = "paci_nombre")
	private String nombre;
	
	@Column(name = "paci_apellido")
	private String apellido;
	
	@Column(name = "paci_fecha_nacimiento")
	private LocalDate fecha_nacimiento;
	
	@Column(name = "paci_codigo_seguro")
	private String codigo_seguro;
	
	@Column(name = "paci_genero")
	private String genero;
	
	@Column(name = "paci_estatura")
	private Double estatura;
	
	@Column(name = "paci_peso")
	private Double peso;
	
	@OneToMany(mappedBy = "paciente")
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

	
	
}
