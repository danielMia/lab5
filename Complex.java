
public class Complex extends Real {
	private double complex;
	public Complex(double real, double complex) {
		super(real);
		this.complex = complex;
		// TODO Auto-generated constructor stub
	}
	public double magnitude(){
		double abs = Math.sqrt((super.getReal())*super.getReal()+complex*complex);
		return abs;
	}
	public String toString(){
		String result = null;
		if (complex>=0){
			result = String.format("%4.2f+%4.2fi",super.getReal(),complex);
		}
		if (complex<=0){
			result = String.format("%4.2f%4.2fi",super.getReal(),complex);
		}
		return result;
	}
	
}
