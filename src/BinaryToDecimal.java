import java.util.Scanner;

/**
 * 
 * (BinaryFormatException) Exercise 12.7 implements the bin2Dec method to throw
 * a BinaryFormatException if the string is not a binary string. Define a custom
 * exception called BinaryFormatException. Implement the bin2Dec method to throw
 * a BinaryFormatException if the string is not a binary string.
 *
 */
public class BinaryToDecimal {

	/**
	 * Convert binary to decimal
	 * 
	 * @param binaryString
	 * @return
	 * @throws NumberFormatException
	 */
	public static int bin2Dec(String binaryString) throws BinaryFormatException {
		try {
			// convert binary to decimal
			return Integer.parseInt(binaryString, 2);
		} catch (NumberFormatException e) {
			// catch number format exception and convert it to binary format
			// exception
			throw new BinaryFormatException(e.getMessage());
		}
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a binary number : ");
		String binaryString = scanner.nextLine();
		try {
			System.out.println("Decimal number is " + bin2Dec(binaryString));
		} catch (BinaryFormatException e) {
			// Catches binary format exception
			System.out.println("Please enter binary number which should consist only 0 and 1.");
		} finally {
			//close input stream in finally block
			scanner.close();
		}
	}
}
