
public class Fibonacci {

	public static void main(String[] args) {
		int mainNumber = 10, previousNumber = 0, nextNumber = 1, sum = 0;
		System.out.print("Fibonacci Series of "+mainNumber+" numbers:");
		for (int i = 1; i <= mainNumber; ++i)
		{
			System.out.print(previousNumber+" ");
			sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}
}
