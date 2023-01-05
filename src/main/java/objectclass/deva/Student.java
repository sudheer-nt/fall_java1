package objectclass.deva;
public class Student {
	int rollno;
	String gender;
	String course;
	String exam;
	
	public static void main(String[] args) {
		Student vikky = new Student();
		//vikky = reference
		Student dev = new Student();
		
		vikky.rollno = 2324;
		dev.gender = "male";
		//vikky.course = "civil";
		vikky.exam ="maths";
		
		System.out.println("vikky.rollno");
		
		System.out.println(dev.gender);
		
		System.out.println(dev.exam);

		System.out.println(vikky.course);
		
		
		

	}}


