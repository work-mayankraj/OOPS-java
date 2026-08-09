package Encapsulation;
public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.setLength(5.0);
		rect1.setBreadth(3.0);
		
		System.out.println("Rectangle initial detail :");
		System.out.println("Length :"+rect1.getLength());
		System.out.println("Breadth :"+rect1.getBreadth());
		System.out.println("Area :"+rect1.calculateArea());
		
		Rectangle rect2 = new Rectangle();
		rect2.setLength(7.0);
		rect2.setBreadth(-2.0);
		
		System.out.println("Rectangle initial detail :");
		System.out.println("Length :"+rect2.getLength());
		System.out.println("Breadth :"+rect2.getBreadth());
		System.out.println("Area :"+rect2.calculateArea());
	}
}
