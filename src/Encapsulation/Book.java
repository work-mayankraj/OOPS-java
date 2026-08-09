package Encapsulation;

public class Book {
private int pageNo;
	public void setData(int x) {
		if(x>0) {
			pageNo = x;
		}
		else {
			System.out.println("Wrong Data");
		}
	}
	public void getData() {
		System.out.println(pageNo);
	}
}
