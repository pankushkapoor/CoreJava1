package Lab3;

import java.util.Scanner;

public class ProblemThree2{
	public static boolean check(String str){
		str=str.toUpperCase();
		int as=str.charAt(0)+0;
		int flag=0;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)+0>as){
				as=str.charAt(i);
				flag=1;
			}
			else{
				flag=0;
			}
		}
		if(flag==1)
			return true;
		return false;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		System.out.println(check(str));
		sc.close();
	}
}