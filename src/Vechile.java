public class Vechile {
	int vechileId;
	String make ;
	String model;
	double price;
	
	public void displayDetail() {
		System.out.println("Vechile ID :"+vechileId);
		System.out.println("Make :"+make);
		System.out.println("Model : "+model);
		System.out.println("Price is :"+price);
		
	}
	public void applyDiscount(double percentage) {
		price -= price*(percentage/100);
		System.out.println("Discounted price is: "+price);
	}
}
