package com.edu.scau.zhouxudong.dao;

import java.io.IOException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.edu.scau.zhouxudong.model.Student;

public class StudentImpl implements IStudentDao {

	@Override
	public Student getStudentById(int id) {
		try {
			// 1.获取SqlSessionFactory接口，接口不能直接new，所以有创建的类SqlSessionFacotryBuilder,
			// 也就是SqlSessionFactory的建造者，SqlSessionFactory的功能就是连接数据库，获取连接
			// 因为SqlMapConfig.xml文件里有db.properties配置文件，所以会加载出数据库的driver,url,username,password;还有各种事务管理，映射mapper
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));

			// 2.获取SqlSession接口,用SqlSessionFactory开一个
			SqlSession session = ssf.openSession();

			// 3.执行查询
			// 参数1：要执行哪一条查询语句，就把那条查询语句的id传过来
			// 参数2：执行sql语句需要的参数
			Student student = (Student) session.selectOne("getStudentById", id);

			// 4.关闭连接，释放资源
			session.close();

			// 5.返回结果
			return student;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertStudent(Student student) {
		try {
			// 1.获取SqlSessionFactory接口，接口不能直接new，所以有创建的类SqlSessionFacotryBuilder,
			// 也就是SqlSessionFactory的建造者，SqlSessionFactory的功能就是连接数据库，获取连接
			// 因为SqlMapConfig.xml文件里有db.properties配置文件，所以会加载出数据库的driver,url,username,password;还有各种事务管理，映射mapper
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));

			// 2.获取SqlSession接口,用SqlSessionFactory开一个
			SqlSession session = ssf.openSession();

			// 3.执行新增
			// 参数1：要执行哪一条查询语句，就把那条查询语句的id传过来
			// 参数2：执行的时候，从新new的一个student实例里获取各种信息，从而完成插入

			int result = session.insert("insertStudent", student);
			// 4.提交事务，做增删改都需要
			session.commit();

			// 5.关闭连接，释放资源
			session.close();

			// 6.返回结果
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateStudent(Student student) {

		try {
			// 1.获取SqlSessionFactory接口，接口不能直接new，所以有创建的类SqlSessionFacotryBuilder,
			// 也就是SqlSessionFactory的建造者，SqlSessionFactory的功能就是连接数据库，获取连接
			// 因为SqlMapConfig.xml文件里有db.properties配置文件，所以会加载出数据库的driver,url,username,password;还有各种事务管理，映射mapper
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));

			// 2.获取SqlSession接口,用SqlSessionFactory开一个
			SqlSession session = ssf.openSession();

			// 3.执行新增
			// 参数1：要执行哪一条查询语句，就把那条查询语句的id传过来
			// 参数2：执行的时候，从新new的一个student实例里获取各种信息，从而完成插入

			int result = session.update("updateStudent", student);
			// 4.提交事务，做增删改都需要
			session.commit();

			// 5.关闭连接，释放资源
			session.close();

			// 6.返回结果
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}



	@Override
	public boolean deleteStudent(int id) {
		try {
			// 1.获取SqlSessionFactory接口，接口不能直接new，所以有创建的类SqlSessionFacotryBuilder,
			// 也就是SqlSessionFactory的建造者，SqlSessionFactory的功能就是连接数据库，获取连接
			// 因为SqlMapConfig.xml文件里有db.properties配置文件，所以会加载出数据库的driver,url,username,password;还有各种事务管理，映射mapper
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));

			// 2.获取SqlSession接口,用SqlSessionFactory开一个
			SqlSession session = ssf.openSession();

			// 3.执行新增
			// 参数1：要执行哪一条查询语句，就把那条查询语句的id传过来
			// 参数2：执行的时候，从新new的一个student实例里获取各种信息，从而完成插入

			int result = session.delete("deleteStudent", id);
			// 4.提交事务，做增删改都需要
			session.commit();

			// 5.关闭连接，释放资源
			session.close();

			// 6.返回结果
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}
