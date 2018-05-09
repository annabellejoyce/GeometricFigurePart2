//from class notes
//added generic T that must be subclass of Number
class Circle<T extends Number> extends GeometricFigure2 {
	private T radius;

	public Circle(T radius) {
		this.radius = radius;
	}

	public double calcArea() {
		//use method of Number class to square radius and multiply by PI
		return this.radius.multiply(PI);
	}

	public void display() { // overrides method display() in superclass
		System.out.println("This is a circle with radius " + this.radius.getNumber());
	}
}