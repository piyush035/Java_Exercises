/**
 * Class to convert meter to foot and vice-versa
 * 
 *
 */
public class ConversionFeet {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Print Infor
		System.out.println("Feet \t Meters \t | \t Meters \t Feet");
		System.out.println("----------------------------------------------------------");

		// Process Data
		for (double foot = 1, meter = 20; foot < 10; foot = foot + 1, meter = meter + 5) {
			System.out.print(String.format("%.1f", foot) + "\t ");
			System.out.print(String.format("%.3f", footToMeter(foot)) + "\t \t \t ");
			System.out.print(String.format("%.1f", meter) + " \t \t");
			System.out.print(String.format("%.3f", meterToFoot(meter)) + "\t");
			System.out.println();
		}
	}

	/**
	 * Convert from feet to meters
	 * 
	 * @param foot
	 *            double
	 * @return double
	 */
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	/**
	 * Convert from meters to feet
	 * 
	 * @param meter
	 *            double
	 * @return double
	 */
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
}
