package accessmodifiers.subpriv;

class Employee {
    protected int salary=5000;    //extended class with some fields
    protected int bonus =1000;

}

public class Person extends Employee {     //using to extend the features of Employee class
    protected String signature = "EMPLOYEE";
    protected String firstName = "THUMMALA";
    protected String lastName = "AKSHATH";
    protected String email = "akshath.java@gmail.com";


    protected int age = 25;
    public static void main(String[] args) {  //main class
        Person newObj = new Person();   //object is created
        System.out.println("Name: " + newObj.signature+ " "+ newObj.firstName + " " + newObj.lastName);
        System.out.println("Email: " + newObj.email);
        System.out.println("Age: " + newObj.age);
        System.out.println("salary: " + newObj.salary);
        System.out.println("Bonus: " + newObj.bonus);



    }
}