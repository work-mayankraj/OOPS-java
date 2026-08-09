public class ProfessorMain {
	public static void main(String[] args) {
		Professor p1 = new Professor();
		p1.id = 101;
		p1.name = "Harish Pathak";
		p1.deprt = "CSE";
		p1.yrOfExp = 10;
		
		System.out.println("Professor id : "+ p1.id);
		System.out.println("Professor Name : "+ p1.name);
		System.out.println("Professor Department : "+ p1.deprt);
		System.out.println("Year of experience: "+ p1.yrOfExp);
		
		p1.conductLecture();
		p1.provideFeedback();
		
		
	}
}
