package collections;

import java.util.HashSet;
import java.util.Iterator;

public class demoHashSet {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("AUS");
		h.add("RSA");
		h.add("IND");
		h.add("IND");
		h.add("PAK");
		h.add("BAN");
		h.add("SL");
		System.out.println(h);
		System.out.println(h.remove("AUS"));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		Iterator<String> i =h.iterator();
		
		while(i.hasNext()) {
		System.out.println(i.next());
		//System.out.println(i.next());
		}
	}

}
