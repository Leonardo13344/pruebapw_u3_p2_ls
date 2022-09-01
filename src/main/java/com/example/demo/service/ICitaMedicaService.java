package com.example.demo.service;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaService {
	
	public void crear(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica buscar(Integer id);
	public void eliminar(Integer id);

}
