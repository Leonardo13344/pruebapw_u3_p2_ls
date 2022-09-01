package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPacienteRepository;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	
	@Autowired
	private IPacienteRepository pacienteRepository;
	@Override
	public void crear(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.crear(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscar(id);
	}

	@Override
	public void eiminar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(id);
	}

	@Override
	public Paciente buscarXCed(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscarXCed(cedula);
	}

}
