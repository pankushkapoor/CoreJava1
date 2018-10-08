import java.util.Arrays;

public class ThirdLargestInArray{

	public static void main(String [] args){
		int[] numList = {1,5,8,4,9,7};
		Arrays.sort(numList);
		System.out.print("Third Largest number: " +numList[(numList.length - 3)]);
	}
}