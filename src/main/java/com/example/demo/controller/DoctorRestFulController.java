package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.service.IDoctorService;


@RestController
@RequestMapping("/APIHospital/V1/doctores")
public class DoctorRestFulController {

	@Autowired
	private IDoctorService doctorService;
	
	@PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public String crear(@RequestBody Doctor doctor) {
		String mensaje = "Doctor Insertado Correctamente";
		try {
			this.doctorService.crear(doctor);
		} catch (Exception e) {
			
			mensaje = "Error al intentar ingresar Doctor";
			throw new RuntimeException();
		}
		return mensaje;
	}
	
	@PutMapping
	public String actualizar(@RequestBody Doctor doctor) {
		this.doctorService.actualizar(doctor);
		return "Doctor Actualizado";
	}
	
	@GetMapping(path = "/{idDoctor}", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Doctor> buscar(@PathVariable("idDoctor") Integer idDoctor){
		Doctor doc = this.doctorService.buscar(idDoctor);
		return ResponseEntity.ok(doc);
	}
	
	@DeleteMapping(path = "/{idDoctor}")
	public String eliminar(@PathVariable("idDoctor") Integer idInteger) {
		this.doctorService.eliminar(idInteger);
		return "Eliminado Correctamente";
	}
}
