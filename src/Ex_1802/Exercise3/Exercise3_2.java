package ex_1802.Exercise3;

import java.util.Scanner;

public class Exercise3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		var input = new Scanner(System.in);
		
		System.out.print("input a: ");
		a = input.nextInt();
		
		System.out.print("input b: ");
		b = input.nextInt();
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a % b = " + (a%b));
		System.out.println("a ^ b = " + Math.pow(a,b));
	}
}
