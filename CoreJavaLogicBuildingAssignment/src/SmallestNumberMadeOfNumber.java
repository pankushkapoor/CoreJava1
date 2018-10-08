import java.util.Arrays; 

public class SmallestNumberMadeOfNumber {

	public static void main(String[] args) {
		int []numList={7,6,0,0,3,9};
		Arrays.sort(numList);
		for(int i=0; i < numList.length; i++){
			if(numList[i] == 0 && numList[i+1]!=0){
				numList[0] = numList[i+1];
				numList[i+1] = 0;
				break;
			}
		}
		for(int j=0; j < numList.length; j++)
			System.out.print(numList[j]);
	}
}