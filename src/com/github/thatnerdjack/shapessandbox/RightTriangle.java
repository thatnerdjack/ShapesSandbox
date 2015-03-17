package com.github.thatnerdjack.shapessandbox;

/**
 * Created by block7 on 3/17/15.
 */
public class RightTriangle extends Triangle {
    public RightTriangle(double a, double b, double c) throws InvalidPolygonException {
        super(a, b, c);
        if(Math.sqrt((a*a) + (b*b)) != c) {
            throw new InvalidPolygonException("Not a right triangle");
        }
    }
}
