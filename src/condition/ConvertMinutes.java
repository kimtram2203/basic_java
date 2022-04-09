package condition;
import java.util.Scanner;

public class ConvertMinutes {

    public static void main(String[] Strings) {


        double minutesInYear = 60 * 24 * 365;

        var input = new Scanner(System.in);

        System.out.print("Input minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " to " + years + " years and " + days + " days");
    }
}