package chapter13.exercises1;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * 
 *
 */
public abstract  class GeometricObject {

	/** */
	private String color = "white";;

	/** */
	private boolean filled;

	/** */
	private Date dateCreated = Calendar.getInstance().getTime();

	/**
	 * Construct a default geometric object.
	 */
	public GeometricObject() {
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 * 
	 * @param color
	 * @param filled
	 */
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/**
	 * Return color
	 * 
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Set a new color
	 * 
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, its getter method is named
	 * isFilled
	 * 
	 * @return the filled
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * Set a new filled
	 * 
	 * @param filled
	 *            the filled to set
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * Return a string representation of this object
	 */
	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled
				+ ", dateCreated=" + dateCreated + "]";
	}

	/** Abstract method getArea of the shape
	 * 
	 * @return Area
	 */
	public abstract double getArea();

	/** Abstract method getPerimete
	 * 
	 * @return perimeter
	 */
	public abstract double getPerimeter();
}
