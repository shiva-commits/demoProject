
public class St {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 0 || i == j) {
					System.out.print("*");
				} else if (i == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println("");

		}
	}

}
