package Encapsulation;
import java.util.*;
public class Patientmain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Patient p1 = new Patient();
		
		System.out.println("Enter patient id: ");
		p1.setID(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter patient Name: ");
		p1.setName(sc.nextLine());
		
		System.out.println("Enter patient age: ");
		p1.setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter patient Disease name: ");
		p1.setDisease(sc.nextLine());
		
		p1.display();
	}
}