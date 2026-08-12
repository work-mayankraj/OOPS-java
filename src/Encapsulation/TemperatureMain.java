package Encapsulation;
import java.util.*;
public class TemperatureMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Temperature tem = new Temperature();
		
		System.out.println("Enter temperature is celcius :");
		tem.setTemp(sc.nextInt());
		System.out.println("Celcius : "+tem.getTemp());
		System.out.println("Farenheit :"+tem.getFarenheit());
		
	}
}
