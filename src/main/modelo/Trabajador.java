package modelo;

import java.sql.SQLOutput;

public class Trabajador extends Persona {
	private String isapre;
	private String afp;
	private Empresa empresa;

	public Trabajador(String nombre, String apllido, String rut, String isapre, String afp) {
		this.nombre = nombre;
		this.apellido = apllido;
		this.rut = rut;
		this. isapre = isapre;
		this.afp = afp;
	}

	public void mostrarDatosTrabajador() {
		System.out.println("Nombre: "+this.nombre
				+"\nApellido: "+this.apellido
				+"\nRut: "+this.rut
				+"\nIsapre: "+this.isapre
				+"\nAfp: "+this.afp);
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getApellido(){
		return this.apellido;
	}

	public String getIsapre() {
		return this.isapre;
	}

	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	public String getAfp() {
		return this.afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}
}