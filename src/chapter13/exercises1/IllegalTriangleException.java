/**
 * 
 */
package chapter13.exercises1;
/**
 * Exception if triangle can not be with giving sides.
 * 
 */
public class IllegalTriangleException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1541487201668000294L;

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @param s3
	 */
	public IllegalTriangleException(double s1, double s2, double s3) {
		super("Not a real triangle:" + " side1 = " + s1 + " side2 = " + s2
				+ " side3 = " + s3);
	}
}
