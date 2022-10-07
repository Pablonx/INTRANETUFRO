package model;

public class Estudiante {
	private String nombre;
	private String apellido, rut, númeromat;
	public Estudiante(String nombre, String apellido, String rut, String númeromat) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.númeromat = númeromat;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNúmeromat() {
		return númeromat;
	}

	public void setNúmeromat(String númeromat) {
		this.númeromat = númeromat;
	}
}