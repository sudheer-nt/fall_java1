package collections.list.deva;

import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

public class Test {

	public static void main(String[] args) {
		Person p = new Person(1, "dev", "sri indu", "NAAS");
		Person p1 = new Person(2, "anvesh", "CVR", "AMEX");
		Person p2 = new Person(3, "Akshath", "CBIT", "infosys");

		List<Person> list = new ArrayList();
		list.add(p);
		list.add(p1);
		list.add(p2);

		System.out.println(list);
		list.remove(0);

		for (int i = 0; i <= list.size(); i++) {
			System.out.println(list);
			

		}
	}}

	

