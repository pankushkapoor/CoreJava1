import java.util.Arrays;

public class Solution10 {

	static int distinct(int array[], int start, int end){
		int unique = 1;
		
		Arrays.sort(array, start, end - 1);
		
		for(int k = start; k < end - 1; k++)
		{
			if(array[k] == array[k+1]) continue;
			else unique++;
		}
		return unique;
	}

	static int countStops(int person[], int floor[], int maxFloors, int personLimit, int weightLimit){
		int weight = 0, j = 0, i = 0, m = 0, noPerson = 0, count = 1, len = person.length;
		int countDistinct = 0;
		while(j < len - 1){
			m=i;
			while(weight < weightLimit && noPerson < personLimit && i < len){
				noPerson++;
				weight+=person[i];
				i++;
			}
			countDistinct = distinct(floor,m, i);
			count+=countDistinct;
			weight = 0;
			noPerson = 0;
			i = i - 1;
			j = i;
		}
		return count;
	}

	public static void main(String[] args) {
		int person[] = {40, 40, 100, 80, 20, 50};
		int floor[] = {4, 3, 1, 2, 3, 1};
		int maxFloors = 4, personLimit = 5, weightLimit = 200;
		System.out.println("Number of Stops: " + countStops(person, floor, maxFloors, personLimit, weightLimit));
	}
}