package ex_1802.Exercise3;

import java.util.Scanner;

public class Exercise3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Byte a,b;
		var input = new Scanner(System.in);
		
		System.out.print("input a: ");
		a = input.nextByte();
		
		System.out.print("input b: ");
		b = input.nextByte();
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a % b = " + (a%b));
		System.out.println("a ^ b = " + Math.pow(a,b));
	}
}
