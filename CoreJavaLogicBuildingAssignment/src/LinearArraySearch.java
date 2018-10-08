
public class LinearArraySearch {
	public static void main(String[] args) {
		int flag = 0, number = 4, arr1[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] == number){
				System.out.println("Yes it has the number at " +(i+1)+ "  position");
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println("The number doesn't exist'");
		}
	}
}
