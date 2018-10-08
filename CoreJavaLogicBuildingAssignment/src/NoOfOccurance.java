
public class NoOfOccurance {

	public static void main(String[] args) {
		int a[]={2,3,69,84,10,76,324};
		int i,oneDigit,twoDigit,threeDigit;
		oneDigit=0;
		twoDigit=0;
		threeDigit=0;
		for(i = 0; i < a.length; i++)
		{
			if((a[i]/10) == 0)
				oneDigit = oneDigit + 1;
			else if(a[i]/10!= 0 && a[i]/100 == 0)
				twoDigit = twoDigit + 1;
			else if(a[i]/10!=0 && a[i]/100!=0 && a[i]/1000 == 0)
				threeDigit = threeDigit + 1;
		}
		System.out.println("The count of one digit numbers are " +oneDigit);
		System.out.println("The count of two digit numbers are " +twoDigit);
		System.out.println("The count of three digit numbers are " +threeDigit);
	}
}
