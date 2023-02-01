package collections.set.Sumanth;
   
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionsSetTestJava {

	public static void main(String[] args) {
		
		Set names = new LinkedHashSet<>();
		  
		names.add("Nachi");
		names.add("Anvesh");
		names.add("Dev");
		
		System.out.println(names.add("Nachi"));
	    System.out.println(names.add("Dev"));
		
	}

}
