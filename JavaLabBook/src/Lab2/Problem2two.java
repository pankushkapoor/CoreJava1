package Lab2;

import java.util.Scanner;

public class Problem2two {
	public static int checkNumber(int number){
		if(number>0) return 1;
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner ref = new Scanner(System.in);
		int number = ref.nextInt();
		if(checkNumber(number) == 1) System.out.println("Number is positive");
		else System.out.println("Number is negative");
		ref.close();
	}

}
