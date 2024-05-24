package poo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nombre del empleado:");
		String nombre = entrada.nextLine();

		System.out.println("Ingrese el sueldo del empleado:");
		double sueldo = entrada.nextDouble();

		System.out.println("Ingrese los años de antigüedad del empleado:");
		int agos = entrada.nextInt();

		System.out.println("Ingrese el mes de ingreso del empleado (1-12):");
		int mes = entrada.nextInt();

		System.out.println("Ingrese el día de ingreso del empleado:");
		int dia = entrada.nextInt();

		System.out.println("ingrese el porcentaje");
		Double porcentaje = entrada.nextDouble();

		Empleado Empleado1 = new Empleado(nombre, sueldo, agos, mes, dia); // INSTANCIA

		System.out.println("nombre del empleado " + Empleado1.dameNombre());
		System.out.println("suleod dedl empleado " + Empleado1.dameSueldo());
		System.out.println("fecha " + Empleado1.dameFechaContrato());

		System.out.println("total es de " + Empleado1.subeSueldo(porcentaje));
	}

}

class Empleado {
	private String nombre;
	private double sueldo;
	private Date altaContrato;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
	}

	public String dameNombre() { // GETTER
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double dameSueldo() { // GETTER
		return sueldo;
	}

	public Date dameFechaContrato() { // GETTER
		return altaContrato;
	}

	public double subeSueldo(double porcentaje) { // GETTER
		double aumentoo = sueldo + porcentaje / 100;
		sueldo += aumentoo;
		return sueldo;

	}
}
