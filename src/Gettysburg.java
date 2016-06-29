import java.util.Scanner;

public class Gettysburg {
	/**
	 * This is main method. replace string with static
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String URLString = "http://cs.armstrong.edu/liang/Lincoln.txt";
		try {
			java.net.URL url = new java.net.URL(URLString);//Semi colon was missing
			int count = 0;
			try (Scanner input = new Scanner(url.openStream())) { //open curly braces was missing 
				while (input.hasNext()) {
					String Word = input.next();
					//Word was wrong. trim() function was wrong and lenght was wrong 
					if (Word.trim().length() > 0)
						count += 1;
				}
				// one close curly braces was extra
			}
			System.out.println("The number of words is " + count);
		} catch (java.net.MalformedURLException ex) {// Exception was wrongly spelled
			//println was wrongly spelled
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			// out was missing
			System.out.println("IO Errors: no such file");
		}
	}
}
