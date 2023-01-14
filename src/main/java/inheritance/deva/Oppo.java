package inheritance.deva;

public class Oppo extends Mobile {
	String name3 = "working";
	public void workingfine() { 
		System.out.println("working method in oppo");
		
	}
		public static void main (String []args) { 
		Oppo o = new Oppo();
		o.workingfine();
		o.displayscreen();
		System.out.println("everything is fine in oppo");
		
	}

}
