import java.util.Scanner;

public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		String sexo = "";
		int altura;
		int peso;
		do {
			System.out.println("seleciones su sexo  \n1: Hombre  \n2: Mujer"   );
			System.out.println("ingrese su genero");
			sexo = entrada.nextLine();
			
			
	
			
		}while(sexo.equalsIgnoreCase("H")== false && sexo.equalsIgnoreCase("M") == false);
		System.out.println("ingrese el altura:");
		altura = entrada.nextInt();
		
		if(sexo.equalsIgnoreCase("H")) {
			peso = altura - 110;
			
		}else {
		peso = altura - 120;
		}
		System.out.println("tu peos es de " + peso);


	}

}
