package methodoverloading.akshath;

//import methodoverloading.Display;

public class Example extends Dispaly {

    public void add(int c, int d) {
        System.out.println("example add " + "sum is:" + (c + d));
    }
    public void sub(int j, int k) {
        System.out.println("example sub" + "sub is:" + (j - k));
    }
    public static void main(String[] args) {
        Example ob = new Example();
        Dispaly d = new Dispaly();


        d.add(10, 20);
        d.sub(30, 5);
    }
}


