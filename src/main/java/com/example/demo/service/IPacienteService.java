package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteService {
	public void crear(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscar(Integer id);
	public void eiminar(Integer id);
	public Paciente buscarXCed(String cedula);
}
