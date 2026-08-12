package Constructor;
public class Student {
	String stdName;
	int rollNo;
	String courses;
	
	public Student(String name, int roll, String course){
		stdName = name;
		rollNo = roll;
		courses = course;
	}
	void disp() {
		System.out.println("Student Name :"+stdName);
		System.out.println("Roll NUmber :"+rollNo);
		System.out.println("Course Name :"+courses);
	}
}
