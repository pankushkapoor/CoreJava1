
public class Palindrome {

	public static void main(String[] args) {
		int remainder, sum = 0, extra;    
		int number = 1331;
		extra = number;    
		while(number > 0){    
			remainder = number%10;  //getting remainder  
			sum = (sum * 10) + remainder;    
			number/=10;    
		}    
		if(extra == sum)    
			System.out.println("Number is a Palindrome.");    
		else    
			System.out.println("Number is not a Palindrome");    
	}  
}  
