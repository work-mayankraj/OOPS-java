package Encapsulation;
public class Rectangle {
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setLength(double l) {
		length = (l > 0) ? l :0.0;
	}
	public void setBreadth(double b) {
		breadth = (b > 0) ? b : 0.0;
	}
	public double calculateArea() {
		return length * breadth;
	}
}

