package Constructor;
public class StudentName {
	public static void main(String[] args) {
		Student std1 = new Student("Alice Brown",201,"Mathematics");
		Student std2 = new Student("Bob Green",202,"Physics");
		Student std3 = new Student("Chalie Black", 202, "Chemistry");
		
		std1.disp();
		std2.disp();
		std3.disp();
	}
}
