package com.cga.clinica.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Paciente {

	private int idPaciente;
	private String nombre;
	private String apellidos;
	private int edad;
	private int telefono;
	private String direccion;
	private String historial;

	public void imprimirHistorial() {
		System.out.println("Paciente con Historial");
	}

	public Paciente() {
	}

	public Paciente(int idPaciente, String nombre, String apellidos, int edad, int telefono, String direccion,
			String historial) {
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.historial = historial;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	@Autowired
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHistorial() {
		return historial;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}

	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", historial=" + historial + "]";
	}

}
