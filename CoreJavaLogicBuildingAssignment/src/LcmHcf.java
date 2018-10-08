public class LcmHcf {
 
	static int FindingHCF(int first,int second)
	{
		int value=(first<second?first:second);
		for (int i = value; i>=1; i--)
		{
			if (first%i == 0 && second%i==0)
				return i;
		}
		return 1;
	}
	public static void main(String[] args) {
		int number1 = 7, number2 = 5;
		System.out.println(FindingHCF(number1,number2));
		System.out.println(number1*number2/FindingHCF(number1,number2));
	}
}