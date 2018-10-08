public class ManipulatingArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9};
		int i, j;
		for(i = 0, j = arr.length-1; i < arr.length && j > 0; i++, j--){
			System.out.print(arr[j]);
			if(i == j) //mid element, to avoid printing two times.
				break;
			System.out.print(",");
			System.out.print(arr[i]);
			System.out.print(",");
		}
	}
}