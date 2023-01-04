package objectclass.akshath;
//using toString method
class Employer {
    String name;
    int id ;
    Employer(String name,int id){
        this.name=name;
        this.id=id;
    }
    public static void main(String[]args){
        Employer emp=new Employer("Developer",100);
            System.out.println("employer details are:"+ emp );
    }
}

