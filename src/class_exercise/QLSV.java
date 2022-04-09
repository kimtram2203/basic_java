package class_exercise;

import java.util.Arrays;

public class QLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student tram = new Student("Tram", "22/03/2001", 1, 8.0, 4);
		Student trung = new Student("Trung", "01/01/1989", 0, 7, 4);
		Student quang = new Student("Quang", "20/01/1998", 0, 8.0, 5);
		Student tin = new Student("Tin", "01/01/1997", 0, 6, 3);
		
		Student[] students = {tram, trung, quang, tin};
		
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i].getFullname() + ", ");
		}
		
		Arrays.sort(students);
		
		System.out.println("");
	
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i].getFullname() + ", ");
		}
	}

}
