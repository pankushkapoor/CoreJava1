package Lab3;

import java.util.Scanner;

public class ProblemThree7 {
	static boolean validate(String string){
		if(string.substring(string.length()- 4, string.length()).equals("_job")){
			if(string.length() - 4 >= 8){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String string = sc.nextLine();
		System.out.println(validate(string));
		sc.close();
	}
}
