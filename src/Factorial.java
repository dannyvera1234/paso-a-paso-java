import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z: int[] mi = new int [5];

		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int num = entrada.nextInt();
		long resultado = 1L;
		for (int i = num; i > 0; i--) {

			System.out.println(i);
			 resultado = resultado * i;
		}
		System.out.println(resultado);
	}

}
