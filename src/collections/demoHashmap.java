package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demoHashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Hi");
		hm.put(2, "Great");
		System.out.println(hm.get(2));
		hm.remove(1);
		System.out.println(hm.get(1));

		Set sm = hm.entrySet();
		Iterator it = sm.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}

	}

}
