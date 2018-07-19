package com.edu.scau.zhouxudong.dao;

import com.edu.scau.zhouxudong.model.Student;

public class Test {

	public static void main(String[] args) {

		IStudentDao dao = new StudentImpl();
//	Student student = new Student(1,"东哥");
//		
//		 
//		boolean result = dao.updateStudent(student);
//		
//		System.out.println(student.getName()+"更新"+result);
//		boolean result1 = dao.deleteStudent(1);
//		System.out.println(result1);
//		for (int i = 1; i < 6; i++) {
//			Student student1 =dao.getStudentById(i);
//			System.out.println(student1);
//		}
//		
		Student student = new Student();
		student.setName("东哥");
		boolean result = dao.insertStudent(student);
		System.out.println("插入 "+result+" "+student);
		
		
		
		
	}
}
