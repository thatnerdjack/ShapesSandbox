package com.github.thatnerdjack.shapessandbox;

public class Triangle extends Polygon {
	double a, b, c;
	
	public Triangle(double a, double b, double c) throws InvalidPolygonException {
		super(new double[] {a, b, c});
		this.a = a;
		this.b = b;
		this.c = c;
        for(double s : sides) {
            if((a+b < c) || (a+c < b) || (b+c < a)) {
                throw new InvalidPolygonException("Invalid triangle side size");
            }
        }
	}


	public double area() {
		double angleC = Math.acos((a*a + b*b - c*c)/(2 * a * b));
		return 0.5 * Math.sin(angleC) * a * b;
	}

	public double perimeter() {
		return a + b +c;
	}


	public String toString() {
		return super.toString() + " a = " + a + " b = " + b + " c = " + c;
	}
}
