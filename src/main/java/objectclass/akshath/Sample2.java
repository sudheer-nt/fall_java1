package objectclass.akshath;
//using toString method

public class Sample2 {
    int empId;
    String empName;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Sample2(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public static void main(String[]args){
        Sample2 emp=new Sample2(100,"Developer");
            System.out.println(emp.toString());
    }}


