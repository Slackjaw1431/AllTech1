package com.student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements StudentInt, Serializable {
	
	private static final long serialVersionUID = 1L;
	private int rollNo;
	private String name;
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalMarks;
	
	public Student() {};
	
	public Student(int rollNo, String name, int subject1,
			int subject2, int subject3, int totalMarks) {
		this.rollNo = rollNo;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.totalMarks = totalMarks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubject1() {
		return subject1;
	}

	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	public int getSubject3() {
		return subject3;
	}

	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public void readStudInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student no: ");
		this.setRollNo(scan.nextInt());
		System.out.println("Enter student name: ");
		this.setName(scan.next());
		System.out.println("Enter student score 1: ");
		this.setSubject1(scan.nextInt());
		System.out.println("Enter student score 2: ");
		this.setSubject2(scan.nextInt());
		System.out.println("Enter student score 3: ");
		this.setSubject3(scan.nextInt());
		this.setTotalMarks(calcTotal());
		
	}

	@Override
	public int calcTotal() {
		return this.subject1+this.subject2+this.subject3;
	}

	@Override
	public void printStudInfo() {
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream("d://StudentInfo.txt");
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Student stu = (Student) obj;
			
			System.out.println(stu.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name="
				+ name + ", subject1=" + subject1
				+ ", subject2=" + subject2 + ", subject3="
				+ subject3 + ", totalMarks=" + totalMarks
				+ "]";
	}
	
	

}
