package shapes;

public class Rectangle implements Shape{
	private double width = 0;
	private double length = 0;
	
	public Rectangle(double width, double length) {
		super();
		if(width > 0 && length > 0) {
			this.width = width;
			this.length = length;
		}
		else {
			System.out.println("Invalid side!");
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double perimeter() {
		return 2*width+2*length;
	}

	@Override
	public String toString() {
		return "Rectangle {w=" + width + ", h=" + length + "} ";
	}
	
	
	
}
