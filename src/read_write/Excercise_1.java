package read_write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Excercise_1 {
	
	static String filePath = "E:\\output_java\\Excercise_1.tx";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String number = random();
		var input = new Scanner(System.in); 
		System.out.print("Input String: ");
		String text = input.next();
		write(number, text);
		System.out.println("==================================");
		read();
	}
	
	static String random() {
		String result = "";
        for (int i=0; i<5; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            result += String.valueOf(randomInt) + ", ";
        }
        return result;
    }
	
	static void write(String number, String text) throws IOException {
		FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(filePath);
            byte numBytes[] = number.getBytes();
            byte textBytes[] = text.getBytes();// converting string into byte array
            fout.write(numBytes);
            fout.write("\n".getBytes());
            fout.write(textBytes);
            fout.close();
        } catch (Exception e) {
            System.out.println("Errors: "+ e);
        } finally {
            fout.close();
        }
	}
	
	static void read() throws IOException {
		FileInputStream fin = null;
        try {
            fin = new FileInputStream(filePath);
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fin.close();
        }
	}
}
