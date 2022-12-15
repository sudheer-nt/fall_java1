package methodoverriding;

public class room extends Family {
    @Override
    public void children(){
        super.children();
        System.out.println("after overriding");

    }
    public static void main (String[]args){
        Family rm= new room();
        rm.children();
    }


}
