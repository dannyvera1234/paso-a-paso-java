import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato = new Scanner(System.in);
		
		System.out.println(" eigen una opcion \n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo");
		System.out.println("selecciona un numero:");
		int opcion = dato.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("para culcula el area de cuadrado se necesita multimplicar lado por lado");
			System.out.println("ingrese el lado del cuadrado");
		int	lado = dato.nextInt();
		int area = lado * lado;
			System.out.println("el area del cuadrado es: " +  area + "cm");
			break;
		case 2:
			System.out.println("para calcula el area de un rectangulo se necesita multi lado por ancho");
			System.out.println("ingrese el lado del retangulo:");
			int lado_rectangulo = dato.nextInt();
			System.out.println("ingrese el ancho del rectangulo:");
			int ancho_rectangulo = dato.nextInt();
			int area_rectangulo = lado_rectangulo * ancho_rectangulo;
			System.out.println("el area del rectangulo es: " +  area_rectangulo + " unidades cuadradas");
			break;
		case 3:
			System.out.println("para calcular el area de un triangulo se necesita multi base y alura por partido por 2");
			System.out.println("ingrese la base del triagulo:");
			int base_triangulo = dato.nextInt();
			System.out.println("ingrese laaltura del triagulo:");
			int altura_triangulo = dato.nextInt();
			int area_triangulo = (base_triangulo * altura_triangulo)/2;
			System.out.println("el area del triangulo es: " +  area_triangulo  + " unidades cuadradas");
			break;
		case 4:
			System.out.println("para calcular el area de un circulo es pi multiplicado por el radio al cuadrado");
			System.out.println("ingrese el el radio del circulo:");
			int radio = dato.nextInt();
			
		
			double resultado =  Math.PI*(Math.pow(radio,2)) ;
			System.out.printf(  "el area del circulo es: " + resultado );
			break;
		default:
			 System.out.println("ingrese un numero valido de las opciones a elegir");
			break;
		}
	}

}
