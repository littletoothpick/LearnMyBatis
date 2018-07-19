package com.edu.scau.zhouxudong.dao;

import com.edu.scau.zhouxudong.model.Student;

public interface IStudentDao {
	public Student getStudentById(int id);
	public boolean insertStudent(Student student); 
	public boolean updateStudent(Student student);
	public boolean deleteStudent(int id);
}
