package inheritance;

public class Theatre extends Movie {
    public void dispaly(){
        System.out.println("running in hurricanes");
    }

    public static void main (String[]args) {
        Theatre T=new Theatre();
        T.dispaly();
        T.avatar4();
    } }