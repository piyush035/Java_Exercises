/**
 * 
 */
package chapter13.exercises1;

/**
 * (Triangle class) Design a new Triangle class that extends the abstract
 * GeometricObject class. Draw the UML diagram for the classes Triangle and
 * GeometricObject and then implement the Triangle class. Write a test program
 * that prompts the user to enter three sides of the triangle, a color, and a
 * Boolean value to indicate whether the triangle is filled. The program should
 * create a Triangle object with these sides and set the color and filled
 * properties using the input. The program should display the area, perimeter,
 * color, and true or false to indicate whether it is filled or not.
 */
public class Triangle extends GeometricObject {

	/** */
	private double side1 = 1.0;

	/** */
	private double side2 = 1.0;

	/** */
	private double side3 = 1.0;

	public Triangle() throws IllegalTriangleException {
		isValidTriangle();
	}

	/**
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		isValidTriangle();
	}

	/**
	 * @return the side1
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * @param side1
	 *            the side1 to set
	 */
	public void setSide1(double side1) throws IllegalTriangleException {
		this.side1 = side1;
		isValidTriangle();
	}

	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * @param side2
	 *            the side2 to set
	 */
	public void setSide2(double side2) throws IllegalTriangleException {
		this.side2 = side2;
		isValidTriangle();
	}

	/**
	 * @return the side3
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * @param side3
	 *            the side3 to set
	 */
	public void setSide3(double side3) throws IllegalTriangleException {
		this.side3 = side3;
		isValidTriangle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}

	/**
	 * Get the area of triangle {@inheritDoc}
	 */
	@Override
	public double getArea() {
		return Math.sqrt(
				(getPerimeter() * (getPerimeter() - side1) * (getPerimeter() - side2) * (getPerimeter() - side3)));
	}

	/**
	 * Get the perimeter of triangle {@inheritDoc}
	 */
	@Override
	public double getPerimeter() {
		return (side1 + side2 + side3) / 2;

	}

	/**
	 * Checking is this a triangle or not.
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	public boolean isTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
		return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));
	}

	/**
	 * Checking if triangle can not be made given side then throw an execption.
	 * 
	 * @throws IllegalTriangleException
	 */
	private void isValidTriangle() throws IllegalTriangleException {
		if (!isTriangle(side1, side2, side3)) {
			throw new IllegalTriangleException(side1, side2, side3);
		}
	}
}
