
public class triangle_nested {
	public static void main(String[] args) {
		String k = "*";
		for (int i = 0; i < 6; i++) {

			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				// k = k+3;
			}
			System.out.println("");
		}
	}
}
