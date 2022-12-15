package inheritance.akshath;


public class EnglishMovie extends Movie implements Avatar {

    public void avatar3()
    {
        System.out.println("method calling given body ");
    }

    public static void main (String[]args){
        EnglishMovie e1 = new EnglishMovie();
        e1.avatar3();
        e1.avatar4();


    }


}

