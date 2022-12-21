package collections.set.akshath;

import java.util.HashSet;

public class Example {
    public static void main (String[]args){
        HashSet <String> Games = new HashSet<String>();
        Games.add("NFL");
        Games.add("BasketBall");
        Games.add("Cricket");
        Games.add("Soccer");
        Games.add("volleyball");

        System.out.println ("Games list is"+ Games);
        System.out.println ("Games list is" +  Games. isEmpty());
        System.out.println("Games list is"+ Games.size());
        System.out.println("Games list is"+ Games.contains("NFL"));
        System.out.println("Games list is"+ Games.contains("BeachVolleyBall"));

        //Games.clear();



    }
}
