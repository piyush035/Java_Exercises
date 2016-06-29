
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
public class CalculatorWithException {

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
		int operand1 = 0;
		try {
			operand1 = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {// Handle Number Format Exception and
			// show a message
			System.out.println("Wrong Input: " + args[0]);
			// Terminate the program
			System.exit(0);
		}

		int operand2 = 0;
		try {
			operand2 = Integer.parseInt(args[2]);
		} catch (NumberFormatException e) {// Handle Number Format Exception and
			// show a message
			System.out.println("Wrong Input: " + args[2]);
			// Terminate the program
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Determine the operator and calculate the result
		switch (args[1].charAt(0)) {
		case '+':
			result = operand1 + operand2;
			break;
		case '-':
			result = operand1 - operand2;
			break;
		case '.':
			result = operand1 * operand2;
			break;
		case '/':
			result = operand1 / operand2;

		}
		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
}
