import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  dato = new Scanner(System.in);
		int edad = 0;
		while (true) {
			System.out.println("ingrese la edad");
			
			edad = dato.nextInt();
			
			 if (edad <= 0) {
	                System.out.println("¡Hasta luego!");
	                break; // Salir del bucle si se ingresa nemor a cero
	            }
			if(edad <= 18) {
				System.out.println("adolescente");
			}else if(edad < 40) {
				System.out.println("eres joven");
			}else if(edad <65) {
				System.out.println("eres maduro");
			}else {
				System.out.println("cuidate");
			}
			
			
		}
		
		dato.close();

	}
	

}
