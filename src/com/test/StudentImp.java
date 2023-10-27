package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.student.Student;

public class StudentImp {

	public static void main(String[] args)
			throws IOException {

		Student stu1 = new Student();

		stu1.readStudInfo();
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("d://StudentInfo.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(stu1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		stu1.printStudInfo();
	}

}
