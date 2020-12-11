
public class multidemintionArray {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,0,6}};
		int min =a[0][0];
		int mincol = 0;
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				if(a[i][j]<min) {
				min = a[i][j];
				mincol = j;
				}
			}
		
		}
		int max = a[0][mincol];
		int k =0;
		while(k<2) {
			if (a[k][mincol]> max) {
				max = a[k][mincol];
				
			}
			k++;
		}
		System.out.println(max);
		
		//System.out.println(min);
		//System.out.println(max);
	}

}
