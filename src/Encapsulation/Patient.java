package Encapsulation;
public class Patient {
	private int id;
	private String name;
	private int age;
	private String disease;
	
	void setID(int id) {
		this.id = id;
	}
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		if(age > 0) this.age = age;
		else System.out.println("Age must not be Negative");
	}
	void setDisease(String disease) {
		this.disease = disease;
	}
	int getsetID() {
		return id;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getDisease() {
		return disease;
	}
	
	void display() {
		System.out.println("Patient ID : "+id);
		System.out.println("Patient Name : "+name);
		System.out.println("Patient age : "+age);
		System.out.println("Patient Disease is : "+disease);
	}
	
}