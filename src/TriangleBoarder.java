
public class TriangleBoarder {
	public static void main(String[] args) {
	    int lines = 6;
	    int cols = lines+1;

	    for (int i =0; i < lines-1; i++) {
	        for (int j = 0; j<cols; j++) {
	            if (j == 0 || j == i) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    for (int j=0; j<cols; j++) {
	        System.out.print("*");
	    }
	    System.out.println();
	}
}
