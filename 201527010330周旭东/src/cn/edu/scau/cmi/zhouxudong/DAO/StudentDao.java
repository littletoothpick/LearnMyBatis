package cn.edu.scau.cmi.zhouxudong.DAO;

import cn.edu.scau.cmi.zhouxudong.domain.*;
public interface StudentDao {
     void newStudent(Student student);
     void deleteStudent(Student student);
     void findStudent(Student student) ;
     void updateStudent(Student student) ;
     
}
