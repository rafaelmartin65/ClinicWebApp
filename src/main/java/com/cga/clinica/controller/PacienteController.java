package com.cga.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cga.clinica.pojo.Paciente;
import com.cga.clinica.service.PacienteService;

@Controller
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;

	@RequestMapping("/paciente")
	public String showPacientes(Model model) {
		
		// List all pacientes
		List<Paciente> pacientes = pacienteService.findAll();
		
		// Add key value list of paciente
		model.addAttribute("pacientes", pacientes);
		
		return "/pacientes";
	}
	
	@RequestMapping(value = "/paciente/save", method = RequestMethod.POST)
	//@ModelAttribute: Nos va a leer del modelo con clave Paciente y decirle que de tipo es Paciente pacienteForm
	//y el modelo colocar pacienteForm (que debo colocarlo en index.jsp)
	public String handlePaciente (@ModelAttribute("paciente") Paciente pacienteForm, Model model, RedirectAttributes ra) {

		
		if (pacienteService.saveOrUpdate(pacienteForm)) {
			
			ra.addFlashAttribute("info", "Se han realizado guardados");
		} else {
			
			ra.addFlashAttribute("info", "Error al realizar guardado");
			
		}
		

		return "redirect:/paciente";
	}
	
	@RequestMapping(value = "/paciente/{idPaciente}/actualizar")
	public String updatePaciente(Model model, @PathVariable("idPaciente") int id) {
		
		Paciente paciente = pacienteService.findById(id);
		model.addAttribute("paciente", paciente);
		
		return "paciente";
	}
	
	@RequestMapping("/paciente/{idPaciente}/delete")
	public String deletePaciente(Model model, @PathVariable("idPaciente") int id, RedirectAttributes ra) {
		
		
		//Aplicar un JQuery para mostrar advertencia antes de eliminar
		pacienteService.delete(id);
		
		return "redirect:/pacientes";
	}
	

}
