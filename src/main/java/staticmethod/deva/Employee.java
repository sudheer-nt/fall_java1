package staticmethod.deva;

public class Employee {
	int empId ;
	String empname;
	String empaddress;
	static String workplace;
	
	//static {
		//workplace = "phoenix";
	//}
	// static block
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public static String getWorkplace() {
		return workplace;
	}
	public static void setWorkplace(String workplace) {
		Employee.workplace = workplace;
	}
	
	

}
