package loop;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		var input = new Scanner(System.in); 
        System.out.print("Input min:");
	    int min = input.nextInt();
	    
	    System.out.print("Input max:");
	    int max = input.nextInt();

        for(int n=min;n<=max;n++) {
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
