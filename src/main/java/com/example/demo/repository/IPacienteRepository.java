package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteRepository {
	
	public void crear(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscar(Integer id);
	public void eliminar(Integer id);
	public Paciente buscarXCed(String cedula);

}
