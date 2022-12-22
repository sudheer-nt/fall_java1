package collections.set.nachi;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Employee> t = new TreeSet<Employee>(new Comp());
		t.add(new Employee(52,"nachi",50000.0,"Amex"));
		t.add(new Employee(23,"Kavya",50000.0,"Amex"));
		t.add(new Employee(88,"Deva",50000.0,"Amex"));
		t.add(new Employee(14,"Akshath",50000.0,"Amex"));
		for(Employee e:t)
			
		System.out.println(e.empid+" "+e.empname+" "+e.salary+" "+e.companyname);
	}
	}
	class Comp implements Comparator<Employee>{

		public int compare(Employee e1, Employee e2) {
			
			return e1.empname.compareTo(e2.empname);
		}
		
	}
	


