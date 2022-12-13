package abstractclassinterface.anvesh;
//abstract parent class
abstract class Animal{
 //abstract method
 public abstract void sound();
}
//Dog class extends Animal class
public class Dog extends Animal{

 public void sound(){
	System.out.println("Lion");
 }
 public static void main(String args[]){
	Animal obj = new Dog();
	obj.sound();
 }
}