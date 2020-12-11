
public class staticDemo {
	
	int i = 0; //instant variable
	
	static int j =1; //static variable
	
	public static void getData() { //Static Methid
		System.out.println(j);
	}
	
	public void getData2() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//staticDemo.j =2;
		staticDemo.getData();
		staticDemo n = new staticDemo();
		//n.i = 1;
		n.getData2();
		
	}

}
