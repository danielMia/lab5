
public class Real extends Number {
	private double real;
	public Real(double real){
		this.real = real;
	}
	public String toString(){
	return String.format("%4.2f",real);
	}
	public double magnitude(){
		double abs = real;
		if (abs<0){
			abs = 0-real;
		}
		return abs;
	}
	public double getReal(){
		return real;
	}
}
