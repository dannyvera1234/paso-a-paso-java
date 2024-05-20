
public class Uso_arrays_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// matriz ARRAYS BIDIMINSIONALES
		int matriz[][] = { { 10, 34, 53, 3, 45 }, { 10, 34, 53, 3, 45 }, { 10, 34, 53, 3, 45 },
				{ 10, 34, 53, 3, 45 } };

		for (int i = 0; i < matriz.length; i++) {
			// System.out.println(i);

			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");

			}
		}
		for (int[] is : matriz) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}

	}

}
