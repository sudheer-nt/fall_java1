package objectclass.akshath;

//using getClass() method

public class Sample1 {
    public static void main (String args[]){
        Object student= new String("Tell me the object class name");
        Class c= student.getClass();
        System.out.println("class of object class obj  is:" +c.getName());

    }
}
