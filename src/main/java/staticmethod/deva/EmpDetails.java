package staticmethod.deva;

public class EmpDetails {

	public static void main(String[] args) {
		
		Employee.setWorkplace("Arizona");
		//you can also do it at a class level
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpname("dev");
		e1.setEmpaddress("fetlock trail");
		//e1.setWorkplace("NAAS");
		
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setEmpname("nach");
		e2.setEmpaddress("overland park");
		//e2.setWorkplace("NAAS TECH");
		
		// since Workplace is a static field it has only one location it prints NAAS TECH for both
		
		System.out.println(e1.getEmpId()+ " " +e1.getEmpname()+" "+ e1.getEmpaddress()+" "+ e1.getWorkplace());
		System.out.println(e2.getEmpId()+ e2.getEmpname()+ e2.getEmpaddress()+ e2.getWorkplace());
		
		
		
		
		

	}

}
