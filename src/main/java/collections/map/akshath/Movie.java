package collections.map.akshath;

import java.util.HashMap;
import java.util.Map;

public class Movie {
    public static void main(String[] args){
        HashMap<Integer,String>map= new HashMap<>();
        map.put(11,"Avatar");
        map.put(12,"Black Adam");
        map.put(13,"Wakanda");
        map.put(11,"Avengers");
        map.put(14,"Marvel Studio");
        System.out.println("presenting all methods of map");
        for (Map.Entry cinema:map.entrySet())
        {
            System.out.println(cinema);
            System.out.println(cinema.getKey());
            System.out.println(cinema.getValue());
            System.out.println(cinema.hashCode());
            System.out.println(cinema.getClass());
            System.out.println(cinema.toString());
            System.out.println(cinema.equals(map));
            System.out.println(cinema.setValue(map));
        }
    }
}
