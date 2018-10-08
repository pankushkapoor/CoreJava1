
public class Armstrong {

	public static void main(String[] args) {
		int num = 370, number, extra, total = 0;
        number = num;
        while (number != 0)
        {
            extra = number % 10;
            total = total + extra * extra * extra;
            number /= 10;
        }
        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
