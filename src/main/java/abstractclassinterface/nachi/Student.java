package abstractclassinterface.nachi;

 abstract class Student {
	
	 int rollno;
	 String name;
	 int age;
	 String dept;
	
	public abstract void m1();
	public  void student(int rollno,String name,int age,String dept)
	{
		this.rollno = rollno;
		this.name=name;
		this.age=age;
		this.dept=dept;

		System.out.println(rollno+ " "+name+" "+age+" "+dept);

	}
}
