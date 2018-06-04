package examples.vanita.programs;

import java.util.Scanner;

public class StringTest {

	public static void main(String a[]) {
		String  str = "fan1:10887RPM(min=4500RPM)";
		Scanner scan = new Scanner(str).useDelimiter("\\D+");
		int curr =0;
		int min =0;
		scan.nextInt();
		if(scan.hasNextInt()) {
			curr = scan.nextInt();
		}
		if(scan.hasNextInt()) {
			min = scan.nextInt();
		}
		System.out.println("curr="+curr+ " min="+min);
	}
}
