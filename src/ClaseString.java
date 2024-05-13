
public class ClaseString {

	public static void main(String[] args) {
		
		//LENGTH LA CANTIDAD O LONGITUD DE UNA CADENA DE CARACTERES
		String nombre="daniel vera leon";
		int resul = nombre.length();
		System.out.println("CANTIDAD DE LETRA" +" " +resul);
		
		//charAT PARA OBTENER EL CARACTER EN UNA POSICION ESPECIFICA DENTRO DE UINA CADEDNA
		String dato ="colegio";
		char resultado = dato.charAt(0);
		System.out.println("la letra es:" + resultado);	
		String apellido = "colegio";
		int ultima_letra = apellido.length();;
		System.out.println(ultima_letra);
		char letra = apellido.charAt(ultima_letra -1);
		System.out.println("ultima letra del appllido es: "+ letra);
		
		//
		
	}

}
