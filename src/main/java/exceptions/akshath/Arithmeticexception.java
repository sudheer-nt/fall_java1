package exceptions.akshath;

public class Arithmeticexception {
    public static void main (String[] args){
        int a=5;
        int b=0;
        int c=a/b;
        try{
        System.out.println(c);
         }
        catch(ArithmeticException e){
            System.out.println(c);
            e.fillInStackTrace();

        }
    }

}
