import java.util.Scanner;

public class Ejm_arrays_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double acumulado;
		double interes = 0.10;

		double numero[][] = new double[6][5];
	

		for (int i = 0; i < numero.length; i++) {
			numero[i][0] = 10000;
			acumulado = 10000;
			System.out.println();
			for (int j = 1; j < numero[i].length; j++) {
				acumulado = acumulado + (acumulado * interes);
				numero[i][j] = acumulado;

			}
			interes = interes + 0.01;
		}

		for (int z = 0; z < numero.length; z++) {
			System.out.println();
			for (int h = 0; h < numero[z].length; h++) {
				System.out.printf("%1.2f" , numero[z][h]);
				System.out.print(" ");
			}
		}
	}

}
