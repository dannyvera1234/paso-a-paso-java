import java.util.Scanner;

public class compruba_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int arroba = 0;

		String email = "";
		boolean punto = false;

		System.out.println("ingrese el correo");
		email = entrada.nextLine();

		for (int i = 0; i < email.length(); i++) {

			if (email.charAt(i) == '@') {
				arroba++;


			}
			if (email.charAt(i) == '.') {
				punto = true;
			}
		}
		if (arroba == 1 && punto == true) {
			System.out.println("valido");

		} else {
			System.out.println("invalido");
		}

	}

}
