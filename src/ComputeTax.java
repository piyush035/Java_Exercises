
/**
 * To compute Tax
 *
 */
public class ComputeTax {

	// create constants
	public final static int SINGLE = 1;
	public final static int MARRIED_JOINT = 2;
	public final static int MARRIED_SEP = 3;
	public final static int HEAD_OF_HOUSE = 4;

	/**
	 * Calculate tax based on status
	 * 
	 * @param status
	 * @param taxableIncome
	 * @return
	 */
	public static double computeTax(int status, double taxableIncome) {
		double tax = 0;
		switch (status) {
		case SINGLE:
			if (taxableIncome <= 8350)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 33950)
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			else if (taxableIncome <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
			break;
		case MARRIED_JOINT:
			if (taxableIncome <= 16700)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 67900)
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
			break;
		case MARRIED_SEP:
			if (taxableIncome <= 8350)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 33950)
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			else if (taxableIncome <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
			break;
		case HEAD_OF_HOUSE:
			if (taxableIncome <= 11950)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 45500)
				tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
			else if (taxableIncome <= 117450)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
			break;
		default:
			break;
		}
		return tax;
	}

	public static void main(String[] args) {
		System.out.println(
				"Taxable\tIncome\tSingle\tMarried Joint or Qualifying Widow(er)\tMarried Separate\tHead ofa House");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------");
		int taxableIncome = 50000;
		while (taxableIncome <= 60000) {
			System.out.print(taxableIncome + "\t \t ");
			System.out.print(Math.round(computeTax(SINGLE, taxableIncome)) + "\t \t");
			System.out.print(Math.round(computeTax(MARRIED_JOINT, taxableIncome)) + "\t \t \t \t");
			System.out.print(Math.round(computeTax(MARRIED_SEP, taxableIncome)) + "\t \t \t ");
			System.out.print(Math.round(computeTax(HEAD_OF_HOUSE, taxableIncome)));
			taxableIncome += 50;
			System.out.println();
		}
	}
}
