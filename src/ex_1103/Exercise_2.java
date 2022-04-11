package ex_1103;

import java.util.Scanner;

public class Exercise_2 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// exercise 1
		int[] arrayInput = inputArray();
		System.out.print(averageOfArray(arrayInput));
		
		// exercise 2
		int[] arrayRandom = generateRandomArray();
		System.out.print(averageOfArray(arrayRandom));
		
		// exercise 3
		double[] doubleArrayRandom = generateDoubleArray(arrayRandom.length);
		System.out.print(averageOfTwoArray(arrayRandom, doubleArrayRandom));
		
		// exercise 4 
		showArray(arrayRandom, true);
		showArray(arrayRandom, false);

		
	}
	
	static int[] inputArray() {
		System.out.print("Nhap so phan tu cua mang: ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < n ; i++) {
			System.out.print("Nhap phan tu thu " + i + ": ");
			array[i] = scanner.nextInt();
		}
		
		return array;
	}

	static double averageOfArray(int[] array) {
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum / array.length;
	}
	
	static int[] generateRandomArray() {
		System.out.print("Nhap so phan tu cua mang: ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < n ; i++) {
			double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
			array[i] = (int) randomDouble;
		}
		
		return array;
	}
	
	static double[] generateDoubleArray(int length) {
		
		double[] array = new double[length];
		
		for(int i = 0; i < length ; i++) {
			double randomDouble = Math.random();
			array[i] = randomDouble;
		}
		
		return array;
	}
	
	static double averageOfTwoArray(int[] array, double[] doubleArray) {
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i] + doubleArray[i];
		}
		
		return sum / array.length;
	}
	
	static void showArray(int[] array, boolean reverse) {
		if(reverse) {
			for(int i = array.length - 1; i >= 0; i--) {
				System.out.print(array[i] + ", ");
			}
		}else {
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
	}
}
