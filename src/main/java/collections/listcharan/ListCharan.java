package collections.listcharan;

import java.util.*;

public class ListCharan {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(2);
		l1.add(2);
		l1.add(4);
		System.out.println("list of integer elemnts = " + l1);
		System.out.println(l1.get(0));
		System.out.println(l1.size());
		l1.set(1, 9);
		System.out.println(l1);

		List<String> l2 = new ArrayList<>();
		l2.add("ram");
		l2.add("ram");
		l2.add("sri rama");
		l2.add("raghu rama");
		System.out.println("list of string elemnts = " + l2);
		l2.set(0, "rama");
		System.out.println(l2);

		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i));
		}

	}

}
