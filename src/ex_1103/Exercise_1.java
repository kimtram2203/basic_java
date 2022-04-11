package ex_1103;

import java.util.Scanner;

public class Exercise_1 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exercise3();
//		excercise6();
		excercise7();
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
	
	static void excercise4(int a, int b) {	
		System.out.println(a == 0 ? "Phuong trinh vo nghiem" : ("Phuong trinh co nghiem" + (-b/a)));
	}
	
	static void excercise5(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt vo nghiem");
            } else {
                System.out.println("Pt co 1 nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Pt co 2 nghiem: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Pt co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
        	System.out.println("Pt vo nghiem");
        }
    }
	
	static void excercise6() {
		int a, b, c;
		System.out.print("Ban muon giai phuong trinh bac (1), (2): ");
		int bac = input.nextInt();
		
		if(bac == 1) {
			System.out.print("input a: ");
			a = input.nextInt();
			
			System.out.print("input b: ");
			b = input.nextInt();
			
			excercise4(a,b);
		} else if(bac == 2) {
			System.out.print("Nhap a = ");
	        a = input.nextInt();
	        
	        System.out.print("Nhap b = ");
	        b = input.nextInt();
	        
	        System.out.print("Nhap c = ");
	        c = input.nextInt();
	        
	        excercise5(a, b, c);
		}
	}
	
	static void excercise7() {
		boolean next;
		
		do {
			excercise6();
			System.out.print("Ban co muon tiep tuc (1)/(0): ");
			next = input.nextInt() == 1;
		} while (next);
	}
}
