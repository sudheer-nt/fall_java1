package hello;

import java.util.ArrayList;
import java.util.List;

public class NachiGuide {
    public static void stream() {
        List<Integer> Nos = new ArrayList<>();
        int result = 0;
for (int i =1;i<=10;i++){
    Nos.add(i);
}
for(int j : Nos){

    result += j;

}
System.out.println(result);
    }

}
