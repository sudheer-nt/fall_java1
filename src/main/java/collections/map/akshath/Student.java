package collections.map.akshath;
import sun.font.TrueTypeFont;

import java.util.Map;
import java.util.TreeMap;
public class Student {
   // private static TreeMap<Student, Integer> Marks;

    public static void main(String[] args) {
        TreeMap<String, Integer> Marks = new TreeMap<>();
        Marks.put("Social", 97);
        Marks.put("Science", 93);
        Marks.put("Maths", 98);
        Marks.put("English", 85);
        Marks.put("Telugu", 90);
        for(Map.Entry<String, Integer> Subjects:Marks.entrySet()) {
            System.out.println(Subjects.getKey() + " " + Subjects.getValue());

        }
    }
}