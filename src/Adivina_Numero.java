import java.util.Scanner;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
			
		int dato = (int) (Math.random()* 100);
		System.out.println(dato);
	
		
		int numero = 0;
		
		int intentos= 0; 
	
		do {
			System.out.println("ingres un numero");
			
			numero = entrada.nextInt(); 
			intentos ++;
			
				
			if(numero > dato) {
				System.out.println("te pasaste del numero ");
				
			}else if(numero == dato) {
				System.out.println("numero correcto");
				System.out.println("inteto realizado: " + intentos);
			}
			else {
				System.out.println("te falta numero "  );
				
			}
			
			
		}while (numero != dato);
	
		entrada.close();
		// SEGUNDO EJEMPLOS REDUCIDO CODIGO
		/*
		while (numero != dato) {
			System.out.println("introduca un numeroo");
			numero = entrada.nextInt();
			intentos ++;
			if(numero > dato) {
				System.out.println("mas bajo" + intentos);
			}else if(numero < dato) {
				System.out.println("mas alto" + intentos);
			}
			
		}
		System.out.println("corecto " + "intentos: "+intentos);
		entrada.close();
		
		
		 * */

	}

}
