package ex_1802;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		var input = new Scanner(System.in); 
		System.out.println("y = ax + b");
		
		System.out.print("input a: ");
		a = input.nextInt();
		
		System.out.print("input b: ");
		b = input.nextInt();
		
		System.out.print(a == 0 ? "Phuong trinh co vo so nghiem" : ("Phuong trinh co nghiem" + (-b/a)));
	}

}