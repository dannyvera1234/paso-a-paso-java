import java.util.Scanner;

public class Entrada_ejemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IMPORT DE SCANNER DE JAVA.util  PARA HACE EN INGRESE DATOS CON EL SCANNER SYSTEM.IN
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce tu nombre");
		// NEXTLINE() INGRESA DATOS DE TEXTO
			String nombre_usuario = entrada.nextLine();
		
		System.out.println("iNTRODUCE EDAD,POOR FAVOR");
		//NEXT INT INGRESA O ENTRADA DE ENTERO
		int edad_usuario = entrada.nextInt();
		System.out.println("ingrese tu estatura");
		//NEXT DOUBLE INGRESA O ENTRADA DE DECIMALES
		double estatura = entrada.nextDouble();
		
		System.out.println("hola soy:" + nombre_usuario + "mi edad es" + edad_usuario + "y mi estarua es " + estatura );
		
	}

}
