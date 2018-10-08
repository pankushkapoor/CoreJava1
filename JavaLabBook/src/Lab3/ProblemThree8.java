package Lab3;

import java.util.*;

public class ProblemThree8 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of words");
		int n = sc.nextInt();
		String[] str = new String[n];
		String t;
		for(int i = 0; i < n; i++){
			str[i] = sc.next();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(str[i].compareTo(str[j])>=0){
					t = str[i];
					str[i] = str[j];
					str[j] = t;	
				}	
			}
		}
		for(int i = 0; i < (n+1)/2; i++){
			str[i] = str[i].toUpperCase();
		}
		for(int i = (n+1)/2; i < n; i++){
			str[i] = str[i].toLowerCase();
		}
		for(int i = 0; i < n; i++)
		System.out.println("" + str[i]);	
		sc.close();
	}
}