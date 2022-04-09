package read_write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Excercise_2 {

	static String filePath = "E:\\output_java\\Excercise_2.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Student[] stu = generateStudents();
		write(stu);
		System.out.println("==================================");
		read(stu.length);
	}

	static Student[] generateStudents() {
		Student tram = new Student("Tram", "22/03/2001", 1, 8.0, 4);
		Student trung = new Student("Trung", "01/01/1989", 0, 7, 4);
		Student quang = new Student("Quang", "20/01/1998", 0, 8.0, 5);
		Student tin = new Student("Tin", "01/01/1997", 0, 6, 3);

		Student[] students = { tram, trung, quang, tin};

		return students;
	}

	static void write(Student[] students) throws IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filePath));
			for (Student s : students) {
				oos.writeObject(s);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			oos.close();
		}
	}

	static void read(int length) throws IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			for(int i = 0; i < length; i++) {
				Student student = (Student) ois.readObject();
				System.out.println(student.toString());
			}

		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
