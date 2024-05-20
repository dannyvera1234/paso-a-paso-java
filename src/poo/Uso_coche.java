package poo;

import java.util.Scanner;

public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		Coche Kia = new Coche(); // INSTACIAR UNA CLASES... EJEMPLAR DE CLASE

		String cuero;
		String climatizador;
		
		System.out.println("ingrese si el coche tiene cuero");

		cuero = entrada.nextLine();

		Kia.setAsientos_cueros(cuero);

		System.out.println(Kia.isAsientos_cueros());

		System.out.println("tiene climatizador");

		climatizador = entrada.nextLine();
		
		Kia.setClimatizador(climatizador);

		System.out.println(Kia.isClimatizador());
		
		System.out.println(Kia.getPeso_total());
		
		System.out.println("el repcio final es" + Kia.precio_coche());
	}

}
