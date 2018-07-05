package cn.edu.scau.cmi.zhouxudong.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.scau.cmi.zhouxudong.spring.domain.Student;

public class SpringCLient {

	public SpringCLient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student) ac.getBean("zhouxudong");
		System.out.println(student.getName());

	}

}
