package Encapsulation;
import java.util.*;
public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Student s1 = new Student();
		
		System.out.println("Enter Student Name: ");
		s1.setName(sc.nextLine());
		s1.setAge(19);
		s1.setMarks(85);
			
		System.out.println("Student Name :"+s1.getName());
		System.out.println("Student age: "+s1.getAge());
		System.out.println("Student marks :"+s1.getMarks());

	}
}
