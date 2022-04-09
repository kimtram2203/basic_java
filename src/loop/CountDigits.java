package loop;

import java.util.Scanner;

public class CountDigits {
	public static void main(String args[]){
	      var input = new Scanner(System.in);
	      int count = 0;
	      System.out.print("Input :");
	      int num = input.nextInt();
	      
	      while(num!=0){
	         num = num/10;
	         count++;
	      }
	      
	      System.out.println("Count digits: "+count);
	   }
}
