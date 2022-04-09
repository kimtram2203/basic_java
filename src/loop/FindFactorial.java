package loop;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		var input = new Scanner(System.in); 
		System.out.print("Input num: ");
		int num = input.nextInt();
		int fact=1;
		
		if(num < 0) {
			System.out.println("Not calculate");
			return;
		}
		
		for(int i = 1; i < num + 1; i++) {
			fact = fact * i;
		}
		System.out.println("Result: "+fact);
	}

}
