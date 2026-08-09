public class Main {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.age = 23;
		p1.name = "Shu";
		p1.email = "Shu@gmail.com";
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.email);
		
		p1.work();
		p1.sleep();
		
	}
}
