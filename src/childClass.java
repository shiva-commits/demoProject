public class childClass extends parentClass {
	
	 String name = "Child string";
	
	public void stringData() {
		System.out.println(super.name);
	}
	
	public childClass() {
		super();
		System.out.println("Inside Childclass Constructor");
		
	}
	
	public void getData() {
		super.getData();
		System.out.println("Inside Child Class");
	}

	public static void main(String[] args) {
		
		
		childClass ch = new childClass();
		ch.stringData();
		ch.getData();
	}

}
