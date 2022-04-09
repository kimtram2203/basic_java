package condition;
import java.util.Scanner;

public class ConvertTemp {

    public static void main(String[] Strings) {

        var input = new Scanner(System.in);

        System.out.print("Nhap do F: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " F = " + celsius + " C");
    }
}
