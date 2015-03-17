package com.github.thatnerdjack.shapessandbox;

public class Rectangle extends Polygon {
	double length, width;
	

	public Rectangle(double length, double width) throws InvalidPolygonException {
		super(new double[] {length, width, length, width});
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	@Override
	public double perimeter() {
		return length * 2 + width * 2;
	}

	public String toString() {
		return super.toString() + " length = " + length + " width = " + width;
	}
}

