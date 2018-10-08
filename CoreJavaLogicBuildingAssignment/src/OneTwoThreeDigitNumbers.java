
public class OneTwoThreeDigitNumbers {

	public static void main(String[] args) {
		int numList[]={12,25,8,9,354,1,369,235,741,0};
		int one=0,two=0,three=0;
		for (int i=0;i<numList.length;i++)
		{
			if(numList[i]>=0&&numList[i]<10)
				one++;
			else if(numList[i]>=10 && numList[i] < 100)
				two++;
			else three++;
		}
		System.out.println("One digit numbers count: "+one+"\nTwo digits numbers count: "+two+"\nThree digit numbers count: "+three);


	}

}