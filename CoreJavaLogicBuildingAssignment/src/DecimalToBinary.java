
public class DecimalToBinary {

	public static void main(String[] args) {
		int temp;
		String str = "";
		int number = 29;
		while(number>=1)
		{
			temp = number%2;
			str = temp + "" + str;
			number = number/2;
		}
		System.out.println("Binary number : "+str);
	}
}
