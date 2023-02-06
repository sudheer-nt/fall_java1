package collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CollectionsDemoHashMap {


	public static void main(String[] args) {
		
		Map<String, String> fruits = new HashMap<>();
		fruits.put("Green","greenapple");
		fruits.put("Yellow"," Mango");
		fruits.put("Red","Apple");
		fruits.put("Blue","Blueberry");
		
		
		System.out.println(fruits.get("Yellow"));
		System.out.println(fruits.get("Red"));
		System.out.println(fruits);
		
		fruits.containsKey("Green");
		fruits.containsValue("greenapple");
		System.out.println(fruits.size());
		fruits.remove("Green");
		fruits.replace("blue", "bluegrapes");
		
		
		System.out.println(fruits);
		

	}

}
