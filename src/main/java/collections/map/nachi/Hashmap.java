package collections.map.nachi;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Nachi",52);
		hm.put("Deva",23);
		hm.put("Anvesh",55);
		hm.put("Akshath",5);
		hm.put("Anvesh",6);
		//hm.remove("Akshath");
		System.out.println(hm);
		System.out.println(hm.containsValue(52));
		System.out.println(hm.get("Nachi"));
		hm.remove("Akshath");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
        hm.replace("Nachi", 53);
        System.out.println(hm);
	}

}
