//import java.util.Arrays;

public class Solution17 {

	static int calculatePairs(int numList[]){
		int count = 0, len = numList.length;
		for(int i = 0; i < len - 1; i++){
			for(int j = i + 1; j < len; j++){
				if(numList[i] == numList[j]){
					System.out.println("(" + i + "," + j + ")");
					count++;
				}
			}
		}
		if(count > 1000000000) return 1000000000;
		else return count;
	}
	public static void main(String[] args) {
		int numList[] = {3, 5, 6, 3, 3, 5};
		System.out.println("Number of Pairs are: " + calculatePairs(numList));
	}
}
