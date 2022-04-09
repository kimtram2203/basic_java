package condition;
import java.util.Scanner;

public class CalulateSpeed {

    public static void main(String[] args) {
		var input = new Scanner(System.in); 

		float timeSeconds;
		float mps,kph, mph;

		System.out.print("Input meters: ");
		float distance = input.nextFloat();

		System.out.print("Input hour: ");
		float hr = input.nextFloat();

		System.out.print("Input minutes: ");
		float min = input.nextFloat();

		System.out.print("Input seconds: ");
		float sec = input.nextFloat();

		timeSeconds = (hr*3600) + (min*60) + sec;
		mps = distance / timeSeconds;
		kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Meters/second is "+mps);
		System.out.println("Km/h is "+kph);
		System.out.println("Miles/h is "+mph);
		
	}
}
