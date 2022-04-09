package loop;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		var input = new Scanner(System.in); 
		System.out.print("Input num: ");
		String num = input.next();
		
		for(int i = num.length() - 1; i > -1; i--) {
			System.out.print(num.charAt(i));
		}
	}

}
