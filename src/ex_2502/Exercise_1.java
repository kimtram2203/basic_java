package ex_2502;

import java.util.Scanner;

public class Exercise_1 {
	public static void main(String[] args) {
		var input = new Scanner(System.in); 
        System.out.print("Nhap a = ");
        float a = input.nextFloat();
        System.out.print("Nhap b = ");
        float b = input.nextFloat();
        System.out.print("Nhap c = ");
        float c = input.nextFloat();
        giaiPTBac2(a, b, c);
    }
     
    public static void giaiPTBac2(float a, float b, float c) {
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
}
