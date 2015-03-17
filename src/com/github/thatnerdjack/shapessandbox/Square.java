package com.github.thatnerdjack.shapessandbox;

public class Square extends Rectangle {
	double side;
	
	public Square(double side) throws InvalidPolygonException{
		super(side, side);
		this.side = side;
	}
	
	public String toString() {
		return super.toString() + " side = " + side;
	}
}
