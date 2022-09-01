package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.IPacienteService;

@RestController
@RequestMapping("/APIHospital/V1/pacientes")
public class PacienteRestFulController {
	@Autowired
	private IPacienteService pacienteService;
	
	@PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public String crear(@RequestBody Paciente paciente) {
		String msg = "Paciente Insertado Correctamente";
		try {
			this.pacienteService.crear(paciente);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "Error al insertar Paciente";
			throw new RuntimeException();
		}
		return msg;
	}
	
	@GetMapping(path = "/{idPaciente}", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Paciente> buscar(@PathVariable("idPaciente") Integer idPaciente){
		Paciente paci = this.pacienteService.buscar(idPaciente);
		return ResponseEntity.ok(paci);
	}
	
	@GetMapping(path = "/cedula/{cedula}", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Paciente> buscarXCedula(@PathVariable("cedula") String cedula){
		Paciente paci = this.pacienteService.buscarXCed(cedula);
		return ResponseEntity.ok(paci);
	}
}
