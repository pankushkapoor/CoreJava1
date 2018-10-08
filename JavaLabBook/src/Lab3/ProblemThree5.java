package Lab3;

import java.time.LocalDate;
import java.util.Scanner;
public class ProblemThree5 {
	public static void main(String[] args) {
		System.out.println("Enter the Purchase date in format dd-mm-yyyy:");
		Scanner string1 = new Scanner(System.in);
		String inputDate = string1.nextLine();
		int d = Integer.parseInt(inputDate.substring(0,2));
		int m = Integer.parseInt(inputDate.substring(3,5));
		int y = Integer.parseInt(inputDate.substring(6,10));
		System.out.println("Enter warrantee period as number Of Months and number Of Years in format " + "mm/yy");
		Scanner string2 = new Scanner(System.in);
		String inputPeriod = string2.nextLine();
		int mm = Integer.parseInt( inputPeriod.substring(0,2));
		int yy = Integer.parseInt( inputPeriod.substring(3,5));
		int noOfMonths =((yy * 12) + mm);
		LocalDate purchaseDate = LocalDate.of(y, m, d);
		LocalDate expiryDate = purchaseDate.plusMonths(noOfMonths);
		System.out.println("Expiry Date: " + expiryDate);
		string1.close();
		string2.close();
	}
}
