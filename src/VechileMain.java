public class VechileMain {
	public static void main(String[] args) {
		Vechile v1 = new Vechile();
		v1.vechileId = 10001;
		v1.make = "Toyota";
		v1.make = "Corolla";
		v1.price = 1000;
		
		v1.displayDetail();
		v1.applyDiscount(10);
	}
}
