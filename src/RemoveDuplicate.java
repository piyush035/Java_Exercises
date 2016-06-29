import java.util.Scanner;

/**
 * 
 * This class is for remove duplicate.
 * 
 * (Eliminate duplicates) Write a method that returns a new array by eliminating
 * the duplicate values in the array using the following method header: public
 * static int[] eliminateDuplicates(int[] list) Write a test program that reads
 * in ten integers, invokes the method, and displays the result. Here is the
 * sample run of the program:
 *
 */
public class RemoveDuplicate {
	/**
	 * 
	 * Method to remove duplicate
	 * 
	 * @param list
	 * @return
	 */
	public static int[] eliminateDuplicates(int[] list) {
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			// if array has a defined constant, continue the loop
			if (list[i] == -999999999) {
				continue;
			}
			// boolean that checks if an element is a duplicate
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] == list[j] && list[j] != -999999999) {
					list[j] = -999999999;
					count++;
				}
			}
		}
		int[] result = new int[list.length - count];
		int j = 0;
		// copy the array with only unique values
		for (int i : list) {
			if (i != -999999999) {
				result[j] = i;
				j++;
			}

		}
		return result;
	}

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		// initialize array of length 10
		int[] list = new int[10];
		// enter numbers into array
		for (int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt();
		}
		System.out.println("The distinct numbers are: ");
		int[] result = eliminateDuplicates(list);
		for (int i : result) {
			System.out.print(i + " ");
		}
		scanner.close();
	}
}
