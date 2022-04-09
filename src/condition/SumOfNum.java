package condition;

import java.util.Scanner;

public class SumOfNum {

    public static void main(String[] Strings) {

        var input = new Scanner(System.in);

        System.out.print("input 0 - 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;

        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;

        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;

        int fourthDigit = remainingNumber % 10;

        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("Sum of " + num + " is " + sum);

    }
}
