package shapes;

public class Parallelogram extends Rectangle{

	public Parallelogram(double width, double length) {
		super(width, length);
	}

	@Override
	public String toString() {
		return "Parallelogram {w=" + getWidth() + ", h=" + getLength() + "} ";
	}
	
	
}
