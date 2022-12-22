package inheritance.nachipackage;

 interface Book 
 {
   void book();
}
 interface Pen
 {
	 void pen();
 }
 class Nachi implements Book,Pen
 {
	 String pentype;
	 int noofpages;
	public void pen() 
	{
		this.pentype="black";
		System.out.println(pentype);
	}
	public void book() 
	{
		this.noofpages=200;
		System.out.println(noofpages);
		
	} 
 }
 public class Multipleinheritance
 {
	 public static void main(String args[])
	 {
		 Nachi n =new Nachi();
		 n.pen();
		 n.book();
	 }
 }
 
