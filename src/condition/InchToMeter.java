package condition;
import java.util.Scanner;
public class InchToMeter {

    public static void main(String[] Strings) {

        var input = new Scanner(System.in);

        System.out.print("Input incher: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch " + meters + " meters");

    }
}
