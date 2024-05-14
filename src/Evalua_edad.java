import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  dato = new Scanner(System.in);
			System.out.println("ingrese la edad");
		int edad = dato.nextInt();
		
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
	

}
