package com.github.thatnerdjack.shapessandbox;

public abstract class Polygon {
	
	int nSides;
	double[] sides;
	
	abstract public double area();
	abstract public double perimeter();
	
	public Polygon(double[] sides) throws InvalidPolygonException {
        for(double s : sides) {
            if(s < 0) {
                throw new InvalidPolygonException("Side length must be greater than 0");
            }
        }
		this.sides = sides;
		nSides = sides.length;
	}

}
