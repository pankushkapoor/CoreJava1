package Lab3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ProblemThree6 {
	public static void main(String[] args) {		
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter zone id");
		String zoneid = ref.nextLine();
		accept(zoneid);
		ref.close();
	}
	private static void accept(String zoneid) {	
		ZonedDateTime zone = ZonedDateTime.now(ZoneId.of(zoneid));
		System.out.println(zone);
	}
}