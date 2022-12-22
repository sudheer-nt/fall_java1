package accessmodifiers.subpub;
class Details{
    public void dispaly() {
        System.out.println("Name="+ "Akshath");
        System.out.println("Company="+ "NaaS Technologies");
        System.out.println("Designation="+ "Java Full Stack");
        System.out.println("Experience="+ "6 Years");
    }
}
public class Employee {
    public static void main (String[] args){
        Details D=new Details();
        D.dispaly();
    }
}
