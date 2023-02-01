package collections.set;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSetList {
	

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		
		values.add(45);
		values.add(18);
		values.add(01);
		values.add(07);
		
		System.out.println(values.add(18));
		System.out.println(values.add(07));
		
		for(int i : values)
		System.out.println(i);
		
		
			

	}

}
