import java.util.Arrays;

public class HighestNumberMadeOfNumber{

	public static void main(String [] args){
		int number = 34617,  i = 0; //number is the number to be searched
		int[] numList = new int[5];
		while(number!=0){
			numList[i] = number%10; //breaking the number and putting them in the array
			number/=10;
			i++;
		}
		System.out.print("Highest number: ");
		Arrays.sort(numList);
		for(i = numList.length - 1; i>=0; i--){
			System.out.print(numList[i]);
		}
	}
}