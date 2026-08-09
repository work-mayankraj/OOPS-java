package Encapsulation;
public class Student {
	private String name;
	private int age;
	private int marks;
	
	// setter method
	void setName(String name) {
		this.name = name ;
	}
	void setAge(int age) {
		if(age>0) this.age = age;
		else System.out.println("Age must be greater than zero");
	}
	void setMarks(int marks) {
		if(marks>0) this.marks = marks;
		else System.out.println("Marks must be greater than zero");
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age; 
	}
	int getMarks() {
		return marks;
	}
}
