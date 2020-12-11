
public class constructorDemo {
	// Default Constructot
	public constructorDemo() {
		System.out.println("Inside Constructot");
	}
	
	//Paramize Constructor
	public constructorDemo(int a, int b) {

		System.out.println("A= " +a);
		System.out.println("B= " +b);
	}

	public void getData() {
		System.out.println("Inside void getData");
	}
	
	public static void main(String[] args) {

		constructorDemo cd = new constructorDemo();
		constructorDemo d = new constructorDemo(15, 100);
		
		

	}

}
