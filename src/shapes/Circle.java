package shapes;

public class Circle implements Shape{
	private double radius = 0;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}	

	public Circle(double radius) {
		super();
		if(radius > 0) {
			this.radius = radius;
		}
		else {
			System.out.println("Invalid radius!");
		}
		
	}
	
	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle {r=" + radius + "} ";
	}

	
	
}
