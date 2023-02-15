package methodoverriding.sumanth;

public class MethodOverridingTest {
	
	public void add() {
		int numberone  = 2023;
		String name  = "Nani";
		float f = 2024;
		System.out.println(numberone +" "+name+" "+f);
		
	
		}
	public void add(int num1,int num2) {
		System.out.println(num1+num1);
	}
	
	public void add(float num1,float num2,float num3) {
		System.out.println(num1+num2+num3);
	}
	public void add(double num1,double num2,double num3,double num4) {
		System.out.println(num1+num2+num3+num4);
	}
	
	public void MethodOverloading() {
	}
	public static void main(String[] args) {
		MethodOverridingTest java = new MethodOverridingTest();
		
		java.add();
		java.add(20,30);
		java.add(100,200,300);
		java.add(1.0,2.0,3.0,4.0);
	}
}


