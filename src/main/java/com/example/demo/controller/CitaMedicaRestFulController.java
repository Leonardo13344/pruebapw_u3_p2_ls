package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@RestController
@RequestMapping("/APIHospital/V1/citas")
public class CitaMedicaRestFulController {

	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public String crear(@RequestBody CitaMedica citaMedica) {
		String msg = "Cita Insertada Correctamente";
		try {
			CitaMedica cM = new CitaMedica();
			cM.setNumeroCita(citaMedica.getNumeroCita());
			cM.setFechaCita(citaMedica.getFechaCita());
			cM.setValorCita(citaMedica.getValorCita());
			cM.setLugarCita(citaMedica.getLugarCita());
			this.citaMedicaService.crear(cM);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "Error al insertar cita";
			throw new RuntimeException();
		}
		return msg;
	}
	
	@PutMapping
	public String actualizar (@RequestBody CitaMedica citaMedica) {
		String msg = "Cita Actualizada Correctamente";
		try {
			CitaMedica cM = new CitaMedica();
			cM.setDiagnostico(citaMedica.getDiagnostico());
			cM.setReceta(citaMedica.getReceta());
			cM.setFechaProxCita(citaMedica.getFechaProxCita());
			this.citaMedicaService.actualizar(cM);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "Error al Actualizar cita";
			throw new RuntimeException();
		}
		return msg;
	}
}
