import java.util.Scanner;

public class Acceso_aplicacion {

	public static void main(String[] args) {

		
		Scanner datos = new Scanner(System.in);
		
		String clave= "daniel";
		String pass = "";
		//EQUALS PARA IGUAL SI LOS DATOS SON IGUALES
		while(clave.equals(pass)== false) {
			System.out.println("introduce la contraseña");
			pass = datos.nextLine();
			if(clave.equals(pass)==false){
				System.out.println("contraseña incorrecta");
			}
		}
		System.out.println("contraseña correcta..");
		
	}

}
