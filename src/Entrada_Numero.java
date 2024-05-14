import java.util.Scanner;

public class Entrada_Numero {

	
	 public static void main(String[] args) {
		 double x= 1000.0;
		 Scanner  numero = new Scanner(System.in);
		 
		 System.out.println("Introduce un numero:");
		 String  num1 = numero.nextLine();
		 // esta convitiendo de string a double entero
		 double num2 = Double.parseDouble(num1);
		 System.out.print("la raiz de " + num2 + "es ");
		 //SACAMOS LA RAIZ DE NUMERO INGRESO CON MATH.SQRT
		 System.out.printf("%1.2f", Math.sqrt(num2));
	 }
}
