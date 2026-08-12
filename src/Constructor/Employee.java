package Constructor;
public class Employee {
	String empName;
	int empId; 
	String empDepartment;
	
	public Employee(String name, int id, String dept) {
		empName = name;
		empId = id;
		empDepartment = dept;
	}
	public void disp() {
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee department :"+empDepartment);
	}
}
