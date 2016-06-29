
/**
 * 
 * (NumberFormatException) Listing 7.9, Calculator.java, is a simple commandline
 * calculator. Note that the program terminates if any operand is nonnumeric.
 * Write a program with an exception handler that deals with nonnumeric
 * operands; then write another program without using an exception handler to
 * achieve the same objective. Your program should display a message that
 * informs the user of the wrong operand type before exiting (see Figure 12.12).
 * *
 */
public class CalculatorWithoutException {

	/**
	 * Check a string is numeric or non-numeric
	 * 
	 * @param input
	 * @return true - if input is numeric false - if input is non numeric
	 */
	public static boolean isNumeric(String input) {
		for (char c : input.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Check number of strings passed
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		if (!isNumeric(args[0])) {
			System.out.println("Wrong Input: " + args[0]);
			// Terminate the program
			System.exit(0);
		}
		if (!isNumeric(args[2])) {
			System.out.println("Wrong Input: " + args[2]);
			// Terminate the program
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Determine the operator and calculate the result
		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);

		}
		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
}
