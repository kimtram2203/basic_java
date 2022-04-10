package ex_1103;

import java.util.Scanner;

public class Exercise_1 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise3();
	}
	
	static void welcome() {
		System.out.println("Lap trinh JAVA 2021");
	}
	
	static void exercise2(String text) {
		System.out.println(text);
	}
	
	static void exercise3() {
		int n = 0;
		boolean valid;
		
		do {
			valid = true;
			try {
				System.out.print("input n: ");
				n = input.nextInt();
				if(n <= 0) throw new Exception("Invalid Input");
			}catch(Exception e) {
				valid = false;
				System.out.println("Nhap sai, vui long nhap lai");
				input.nextLine();
			}
		} while (!valid);

		for(int i = 0; i < n; i++) {
			exercise2("Lap trinh JAVA 2021");
		}
	}
	
	

}
