package Lab3;
import java.util.Scanner;

public class ProblemThree1 {
	public static String operation1(String string){
		return string + string;
	}
	public static String operation2(String string){
		String str1="";
		for(int i=0;i < string.length(); i++)
		{
			if(i%2==0){
				str1+='#';
			}
			else{
				str1+=string.charAt(i);
			}
		}
		return  str1;
	}
	public static String operation3(String string){
		String result=""; 
		for(int i=0;i<string.length();i++)
		{
			char c=string.charAt(i);
			if(result.indexOf(c)==-1){
				result+=c;
			}
		}
		return result;
	}
	public static String operation4(String string){
		String str11="";
		for(int i=0;i<string.length();i++)
		{
			String uppercase=string.toUpperCase();
			if(i%2==0){
				str11+=uppercase.charAt(i);
			}
			else{
				str11+=string.charAt(i);
			}
		}
		return  str11;
	}
	public static void main(String[] args) {
		String string;
		System.out.println("Enter a String: ");
		Scanner ref = new Scanner(System.in);
		string = ref.nextLine();
		System.out.println("Enter a choice (1,2,3,4): ");
		int choice = ref.nextInt();
		if(choice == 1) System.out.println(operation1(string));
		else if(choice == 2) System.out.println(operation2(string));
		else if(choice == 3) System.out.println(operation3(string));
		else System.out.println(operation4(string));
		ref.close();
	}

}
