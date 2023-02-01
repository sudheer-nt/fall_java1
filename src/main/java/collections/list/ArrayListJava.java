package collections.list;

import java.util.ArrayList;
import java.util.List;


public class ArrayListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Animal");
		s1.add("Birds");
		s1.add("Trees");
		s1.add(" Flowers");
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("Nani");
		s2.add("Venu");
		s2.add("Sunil");
		List<String> Together = new ArrayList<>();
		Together.addAll(s1);
		Together.addAll(s2);
		System.out.println(" The together string is" + Together);
		s1.remove(2);
		System.out.println(s1);
		//for ( String s:s1)
		//System.out.println(a);
		  System.out.println(s1.get(2));
		  
			
	}

}
