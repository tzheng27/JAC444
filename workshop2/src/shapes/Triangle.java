package shapes;

public class Triangle implements Shape {
	private double s1 = 0;
	private double s2 = 0;
	private double s3 = 0;
	
	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}

	public Triangle(double sidea, double sideb, double sidec) {
		super();
		if(sidea > 0 && sideb > 0 && sidec > 0) {
			if(sidea + sideb > sidec && sidea + sidec > sideb && sideb + sidec > sidea) {
				if (sidea > sideb) {
					if(sidea > sidec) {
						s3 = sidea;
						if(sideb > sidec) {
							s2 = sideb;
							s1 = sidec;
						}
						else {
							s2 = sidec;
							s1 = sideb;
						}
					}
					else {
						s3 = sidec;
						s2 = sidea;
						s1 = sideb;
					}
				}
				else if(sideb > sidec) {
					s3 = sideb;
					if(sidea > sidec) {
						s2 = sidea;
						s1 = sidec;
					}
					else {
						s2 = sidec;
						s1 = sidea;
					}
				}
				else {
					s3 = sidec;
					s2 = sideb;
					s1 = sidea;
				}
			}
		}
	}
	
	@Override
	public double perimeter() {
		return s1+s2+s3;
	}
	
	@Override
	public String toString() {
		return "Triangle {s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "} ";
	}
	
	
	
}
