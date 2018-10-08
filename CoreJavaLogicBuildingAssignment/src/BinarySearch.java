public class BinarySearch {

	public static void main(String[] args) {
		int numList[]={6,2,3,5,7};
		int first = 0, last = numList.length - 1, numberFind = 3;
		int mid;
		while(first<=last){
			mid = first + (last - first)/2;
			if(numList[mid]==numberFind){
				System.out.println("The number is at index: "+mid);
				break;
			}
			if(numList[mid] > numberFind)
				last = mid - 1;
			else
				first = mid + 1;
		}
	}
}