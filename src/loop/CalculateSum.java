package loop;

import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var input = new Scanner(System.in); 
		System.out.print("Input num: ");
		int max = input.nextInt();
		int sum = 0;
		
		for(int i = 1; i < max + 1; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum: "+sum);
	}

}
