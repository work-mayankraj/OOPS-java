package Constructor;
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee("Alice",100,"CSE");
		Employee emp2 = new Employee("Bob",101,"ECE");
		System.out.println("Enter the Name of third Employee :");
		Employee emp3 = new Employee(sc.nextLine(),102,"CSE");
		
		emp1.disp();
		emp2.disp();
		emp3.disp();
	}
}
