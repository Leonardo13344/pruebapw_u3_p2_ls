package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDoctorRepository;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.service.to.DoctorTo;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorRepository doctorRepository;

	@Override
	public void crear(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.crear(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepository.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepository.eliminar(id);
	}
	
	/*private DoctorTo convert(Doctor doctor) {
		DoctorTo docT = new DoctorTo();
		docT.set
	}*/

}
