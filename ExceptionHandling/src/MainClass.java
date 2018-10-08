import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		try{
			Scanner ref = new Scanner(System.in);
			System.out.println("Enter number: ");
			int n1 = ref.nextInt();
			System.out.println("Enter number: ");
			int n2 = ref.nextInt();
			System.out.println(n1/n2);
			ref.close();
		}
		catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("Enter numbers ony");
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Enter second number other than 0");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Enter second number other than 0/..");
		}
		System.out.println("This line is outside of try block");
	}

}
