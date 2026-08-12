package Encapsulation;
public class Temperature {
	private double celcius;
	
	void setTemp(double celcius){
		this.celcius = celcius;
	}
	
	double getFarenheit() {
		return (celcius * 9/5) + 32;
	}
	double getTemp() {
		return celcius;
	}
}