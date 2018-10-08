public class SwappingNumbers {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		firstNumber = 5;
		secondNumber = 4;
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("Value of first number after swapping " +firstNumber);
		System.out.println("Value of second number after swapping " +secondNumber);
	}
}