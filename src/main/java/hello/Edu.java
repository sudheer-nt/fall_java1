package hello;

public class Edu {
	String name;
	 int rollno;
	
	// constructor
	void Edu() {
		this.name = "Education";	
	}
	public void Edu(int rollno,String name) {
		this.name=name;
		this.rollno=rollno;
	}
	 public static void main (String [] args) {
		 Edu obj = new Edu();
		obj.Edu(21,"sumanth");
		System.out.println(obj.name+" "+obj.rollno);
		 
		
		 
				
		
	}

}
