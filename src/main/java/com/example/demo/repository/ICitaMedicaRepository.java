package com.example.demo.repository;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {

	public void crear(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica buscar(Integer id);
	public void eliminar(Integer id);
	public void agendar(CitaMedica citaMedica);
}
