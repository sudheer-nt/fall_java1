package collections.map.anvesh;
import java.util.HashMap;

public class CollectionsMapmain {

	public static void main(String[] args) {
		CollectionsMapdemo c = new CollectionsMapdemo();
		HashMap<Integer,String> students = new HashMap();
		students.put(123,"Anvesh");
		students.put(456,"Kiran");
		students.put(789,"Pranay");
		students.put(643,"Shiva");
		students.put(345,"Kunal");
		students.put(342,"Ravi");
		c.display(students);
	}
}
