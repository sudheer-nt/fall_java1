package collections.map;

import java.util.HashMap;

public class CollectionsExample {

	public static void main(String[] args) {
		
		HashMap<String , Integer> Cricket = new HashMap<String , Integer>();
		Cricket.put("Raina", 03);
		Cricket.put("Dhoni", 07);
		Cricket.put("Jaddu", 8);
		Cricket.put("Virat", 18);
		Cricket.put("Bhuvi", 10);
		
		System.out.println(Cricket);
		System.out.println(Cricket.get("Jaddu"));
		System.out.println(Cricket.containsKey(18));
		System.out.println(Cricket.keySet());
		System.out.println(Cricket.remove("Bhuvi"));
		System.out.println(Cricket.values());
		System.out.println(Cricket.size());
	
		
		

	}

	
	}


