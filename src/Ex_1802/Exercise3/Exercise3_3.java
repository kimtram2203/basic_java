package ex_1802.Exercise3;

import java.util.Scanner;

public class Exercise3_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		var input = new Scanner(System.in);
		
		System.out.print("input a: ");
		a = input.nextDouble();
		
		System.out.print("input b: ");
		b = input.nextDouble();
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a ^ b = " + Math.pow(a,b));
	}
}
