/**
 * 
 */
package class_exercise;

import java.io.Serializable;

public class Student implements Cloneable, Comparable<Student>, Serializable {

	private String fullname;
	private String birthdate;
	private int gender;
	private double gpa;
	private int social_activities;

	public Student(String fullname, String birthdate, int gender, double gpa, int social_activities) {
		this.fullname = fullname;
		this.birthdate = birthdate;
		this.gender = gender;
		this.gpa = gpa;
		this.social_activities = social_activities;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getSocial_activities() {
		return social_activities;
	}

	public void setSocial_activities(int social_activities) {
		this.social_activities = social_activities;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if (this.gpa < s.gpa) return -1;
		else if (this.gpa > s.gpa) return 1;
		else {
			if (this.social_activities > s.social_activities) return 1;
			else if (this.social_activities < s.social_activities) return -1;
			else return 0;
		}
	}
}