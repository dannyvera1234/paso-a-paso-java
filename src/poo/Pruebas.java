package poo;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1 = new Empleados("daniel");
		Empleados trabajador2 = new Empleados("dansdiel");
		Empleados trabajador3 = new Empleados("daneiel");
		Empleados trabajador4 = new Empleados("daneiel");
		trabajador1.setSeccion("rrhh");

		System.out.println(trabajador1.getNombre() + "\n" + trabajador2.getNombre() + "\n" + trabajador3.getNombre()
				+ "\n" + trabajador4.getNombre());
		System.out.println( Empleados.dameIdSiguiente());
	}

}

class Empleados {
	private final String nombre;
	private String seccion;
	private int Id;
	private static int idSiguiente = 1;

	public Empleados(String nom) {

		nombre = nom;
		seccion = "Administracion";
		Id = idSiguiente;
		idSiguiente++;

	}

	public static String dameIdSiguiente() {
		return "el id siguiente es:" + idSiguiente;
	}

	public String getNombre() {
		return "el nombre es " + nombre + " la seccion es " + seccion + " el ide es " + Id;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

}
