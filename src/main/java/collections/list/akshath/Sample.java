package collections.list.akshath;
import java.util.*;
public class Sample {
    public  static void main (String[] args){
        List<String> l1=new ArrayList<>();
        l1.add("NaaS");
        l1.add("Technologies");
        l1.add("Employees");
        List<String> l2=new ArrayList<>();
        l2.add("work on C2C Contract");
        l2.add("which is good");
        List<String> Together=new ArrayList<>();
        Together.addAll(l1);
        Together.addAll(l2);
        System.out.println("The together string is" + Together);
    }
}
