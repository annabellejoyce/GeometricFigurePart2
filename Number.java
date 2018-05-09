abstract class Number {
	private double number;
	
	//number constructor
	Number(double number) {
		this.number = number;
	}
	
	//method to return number
	double getNumber() {
		return this.number;
	}
	
	double multiply(double number) {
		//radius squared by PI that is passed will give area
		return Math.pow(this.number, 2) * number;
	}
	
	public static void main(String[] args) {
		NumberDouble radius = new NumberDouble(6.9);
		Circle<NumberDouble> c = new Circle<NumberDouble>(radius);
		c.display();
		System.out.println("Area is " + c.calcArea());
	}
}
