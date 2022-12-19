package collections.list.nachi;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListtest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Nachi");
		al.add("Sumanth");
		al.add("Nachi");
		al.add("Dev");
		al.add("Akshath");
		al.remove(2);
		//System.out.println(al);
		//for(String s:al)
			//System.out.println(s);
		//System.out.println(al.get(2));
		ListIterator<String> iterator = al.listIterator();
		while(iterator.hasNext())
		{   
			String i = iterator.next();
		     System.out.println(i);	
		}
		
		ArrayList<String> al1= new ArrayList<String>();
		
		al1.add("kavya");
		al1.add("charan");
		al1.add("vignesh");
		al.addAll(1,al1);
		
		System.out.println("Printing all the members");
		for(String n:al)
			System.out.println("After adding all the List :" + n);
		
		for(String s1:al1)
			System.out.println(s1);
		System.out.println(al1.isEmpty());
		System.out.println(al1.size());
			
	}

}
