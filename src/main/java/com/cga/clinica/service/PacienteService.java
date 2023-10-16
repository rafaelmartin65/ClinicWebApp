package com.cga.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cga.clinica.dao.PacienteDao;
import com.cga.clinica.pojo.Paciente;

@Service
public class PacienteService {

	@Autowired
	private PacienteDao pacienteDao;
	
	public boolean save (Paciente paciente) {
		return pacienteDao.save(paciente);
	}
	
	public List<Paciente> findAll(){
		return pacienteDao.findAll();
	}
	
	public Paciente findById(int id) {
		return pacienteDao.findById(id);
		
	}
	
	public boolean saveOrUpdate (Paciente paciente) {
		if (paciente.getIdPaciente()== 0) {
			//insert
			return pacienteDao.save(paciente);
		}else {
			// Update
			return pacienteDao.update(paciente);
		}
	}
	
	public boolean delete(int id) {
		return pacienteDao.delete(id);
	}
	
}
