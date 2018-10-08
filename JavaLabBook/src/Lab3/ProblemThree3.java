package Lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class ProblemThree3{
	public static void main(String[] args) {
		System.out.println("Enter the date in format dd-mm-yyyy:");
		Scanner string = new Scanner(System.in);
		String input = string.nextLine();
		int d = Integer.parseInt(input.substring(0,2));
		int m = Integer.parseInt(input.substring(3,5));
		int y = Integer.parseInt(input.substring(6,10));

		LocalDate date = LocalDate.of(y, m, d);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(date, now);
		System.out.printf("\nDifference is of %d years, %d months and %d days\n\n", 
				diff.getYears(), diff.getMonths(), diff.getDays());
		string.close();
	}
}
