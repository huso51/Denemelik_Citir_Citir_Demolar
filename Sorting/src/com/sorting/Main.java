package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private Long studentNum;
	private String studentName;
	private String studentSurname;
	public Student(long studentNum, String studentName, String studentSurname) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(Long studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSurname() {
		return studentSurname;
	}
	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}
	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", studentName=" + studentName + ", studentSurname="
				+ studentSurname + "]";
	}
	@Override
	public int compareTo(Student o) {
		//return o.getStudentNum().compareTo(this.studentNum);
		return this.getStudentNum().compareTo(o.getStudentNum());
	}
	
}

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(5, "Ahmet", "Erol"));
		students.add(new Student(6, "Zekeriya", "Yağmur"));
		students.add(new Student(3, "Abdül", "Cabbar"));
		students.add(new Student(1, "Selman", "Bin gabbar"));
		
		for(Student s : students) {
			System.out.println(s.toString());
		}
		
		/*Collections.sort(students, (s1,s2) ->{
			return s1.getStudentNum().compareTo(s2.getStudentNum());
		});*/
		
		Collections.sort(students);
		
		System.out.println("--------------");
		
		for(Student s : students) {
			System.out.println(s.toString());
		}
	}

	
}
