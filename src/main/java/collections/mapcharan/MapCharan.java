package collections.mapcharan;

import java.util.*;

public class MapCharan {

	public static void main(String[] args) {

		Map<String, String> playerProfiles = new HashMap<>();
		playerProfiles.put("ronaldo", "portugal");
		playerProfiles.put("messi", "argentina");
		playerProfiles.put("sunil chetri", "india");
		playerProfiles.put("bhuichang", "india");
		System.out.println("soccer" + playerProfiles);
		System.out.println(playerProfiles.get("bhuichang"));
		System.out.println(playerProfiles.keySet());

		HashMap<String, Integer> playerProfilesAge = new HashMap<>();
		playerProfilesAge.put("ronaldo", 38);
		playerProfilesAge.put("messi", 38);
		playerProfilesAge.put("sunil chetri", 38);
		playerProfilesAge.put("bhuichang", 38);
		System.out.println("age" + playerProfilesAge);

	}

}
