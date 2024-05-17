import java.util.Random;
import java.util.Scanner;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner entrada = new Scanner(System.in);
		String matriz [] = { "ecuadoer" ,"italia", "peru" , "sdfsd"};
		String pais []= new String [8];
		System.out.println("ingres el nombre");
		for (int i = 0; i < pais.length; i++) {
			
			pais[i] = entrada.nextLine();
			
		}
		// nuevo for each 
		
		for (String i : pais) {
			System.out.println(i);
		}
		
		*/
		int numero [] = new int[150];
		
		for (int i = 0; i < numero.length; i++) {
			int nume =(int) (Math.random()*100);
			numero[i]= (int)  Math.round(Math.random()*100);
			System.out.println(nume);
		
		}
		for (int i : numero) {
			System.out.print("dfsd" + i);
		}
		
	}

}
