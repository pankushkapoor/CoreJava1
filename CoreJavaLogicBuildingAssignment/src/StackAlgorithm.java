
public class StackAlgorithm {
	
	static int k=0;
	
	static void stackPush(int array[], int number){
		int i;
		
		array[k++] = number;
	}
	
	static int stackPop(int array[]){
		System.out.println("Popped element: " +array[array.length - 1]);
		return array[--k];
	}
	
	public static void main(String[] args) {
		 int array[] = {1,2,3,4,5,6};
		 int number = 6;
		 stackPush(array, number);
		 
		 int length = stackPop(array);
		 
	}

}
