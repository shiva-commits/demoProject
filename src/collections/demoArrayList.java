package collections;

import java.util.ArrayList;

public class demoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Test1");
		a.add("Test2");
		System.out.println(a);
		a.remove(1);
		a.remove("Test1");
		System.out.println(a);
		System.out.println(a.contains("Test1"));
		
		

	}

}
