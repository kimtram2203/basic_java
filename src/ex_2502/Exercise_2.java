package ex_2502;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var input = new Scanner(System.in); 
		String username, password;
		
		System.out.print("input userName: ");
		username = input.next();
		
		System.out.print("input password: ");
		password = input.next();
		
		boolean confirm = username == "HuyHoang" && password == "2021";
		
		System.out.println(confirm ? "Match" : "Not Match");
	}

}
