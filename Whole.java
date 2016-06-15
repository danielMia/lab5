
public class Whole extends Number {
	private int newint;
	public Whole(int newint) {
		this.newint = newint;
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		
		return ""+newint;
	}
	public double magnitude(){
		double result;
		result = (double)newint;
		double abs = result;
		if (abs<0){
			abs = 0-result;
		}
		return result;
	}

}
