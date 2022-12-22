package collections.setCharan;

import java.util.*;

public class SetCharan {

	public static void main(String[] args) {

		HashSet<Integer> playerFamousFor = new HashSet<>();
		playerFamousFor.add(10);
		playerFamousFor.add(4);
		playerFamousFor.add(5);
		playerFamousFor.add(8);
		playerFamousFor.add(4);
		System.out.println(playerFamousFor);
		System.out.println(playerFamousFor.contains(8));
		System.out.println(playerFamousFor.size());
		System.out.println(playerFamousFor.remove(5));
		// playerFamousFor.clear();
		System.out.println(playerFamousFor);

		HashSet<String> playerFamousFor1 = new HashSet<>();
		playerFamousFor1.add("addidas");
		playerFamousFor1.add("nike");
		playerFamousFor1.add("Reebok");
		playerFamousFor1.add("Reebok");
		System.out.println(playerFamousFor1);
	}

}
