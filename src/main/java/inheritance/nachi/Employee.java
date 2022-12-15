package inheritance.nachi;

public class Employee extends Employer
{
	String studycourse;
	int experience;
     public void employee(String studycourse,int experience)
     {
    	 this.studycourse=studycourse;
    	 this.experience=experience;
    	System.out.println(studycourse+" "+experience);
     }
}
