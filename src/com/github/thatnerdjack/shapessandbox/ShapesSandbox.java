package com.github.thatnerdjack.shapessandbox;

public class ShapesSandbox {

	
	public static void main(String[] args) {
		Rectangle r = null;
		Square s = null;
		Triangle t = null;
        Triangle brokenT = null;
        Triangle rightT = null;

		try {
            r = new Rectangle(5.0, 7.0);
            s = new Square(2.5);
            rightT = new RightTriangle(3,4,5);
        } catch(InvalidPolygonException e) {
            System.out.println(e);
        }

        try { //null pointer printing
            System.out.println(r);
            System.out.println(s);
            System.out.println(rightT + " area = " + rightT.area());
        } catch(NullPointerException e) {
            System.out.println(e);
        }

	}

}
