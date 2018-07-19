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
			// 1.��ȡSqlSessionFactory�ӿڣ��ӿڲ���ֱ��new�������д�������SqlSessionFacotryBuilder,
			// Ҳ����SqlSessionFactory�Ľ����ߣ�SqlSessionFactory�Ĺ��ܾ����������ݿ⣬��ȡ����
			// ��ΪSqlMapConfig.xml�ļ�����db.properties�����ļ������Ի���س����ݿ��driver,url,username,password;���и����������ӳ��mapper
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));

			// 2.��ȡSqlSession�ӿ�,��SqlSessionFactory��һ��
			SqlSession session = ssf.openSession();

			// 3.ִ�в�ѯ
			// ����1��Ҫִ����һ����ѯ��䣬�Ͱ�������ѯ����id������
			// ����2��ִ��sql�����Ҫ�Ĳ���
			Student student = (Student) session.selectOne("getStudentById", id);

			// 4.�ر����ӣ��ͷ���Դ
			session.close();

			// 5.���ؽ��
			return student;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertStudent(Student student) {
		try {
			// 1.��ȡSqlSessionFactory�ӿڣ��ӿڲ���ֱ��new�������д�������SqlSessionFacotryBuilder,
			// Ҳ����SqlSessionFactory�Ľ����ߣ�SqlSessionFactory�Ĺ��ܾ����������ݿ⣬��ȡ����
			// ��ΪSqlMapConfig.xml�ļ�����db.properties�����ļ������Ի���س����ݿ��driver,url,username,password;���и����������ӳ��mapper
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));

			// 2.��ȡSqlSession�ӿ�,��SqlSessionFactory��һ��
			SqlSession session = ssf.openSession();

			// 3.ִ������
			// ����1��Ҫִ����һ����ѯ��䣬�Ͱ�������ѯ����id������
			// ����2��ִ�е�ʱ�򣬴���new��һ��studentʵ�����ȡ������Ϣ���Ӷ���ɲ���

			int result = session.insert("insertStudent", student);
			// 4.�ύ��������ɾ�Ķ���Ҫ
			session.commit();

			// 5.�ر����ӣ��ͷ���Դ
			session.close();

			// 6.���ؽ��
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
			// 1.��ȡSqlSessionFactory�ӿڣ��ӿڲ���ֱ��new�������д�������SqlSessionFacotryBuilder,
			// Ҳ����SqlSessionFactory�Ľ����ߣ�SqlSessionFactory�Ĺ��ܾ����������ݿ⣬��ȡ����
			// ��ΪSqlMapConfig.xml�ļ�����db.properties�����ļ������Ի���س����ݿ��driver,url,username,password;���и����������ӳ��mapper
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));

			// 2.��ȡSqlSession�ӿ�,��SqlSessionFactory��һ��
			SqlSession session = ssf.openSession();

			// 3.ִ������
			// ����1��Ҫִ����һ����ѯ��䣬�Ͱ�������ѯ����id������
			// ����2��ִ�е�ʱ�򣬴���new��һ��studentʵ�����ȡ������Ϣ���Ӷ���ɲ���

			int result = session.update("updateStudent", student);
			// 4.�ύ��������ɾ�Ķ���Ҫ
			session.commit();

			// 5.�ر����ӣ��ͷ���Դ
			session.close();

			// 6.���ؽ��
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
			// 1.��ȡSqlSessionFactory�ӿڣ��ӿڲ���ֱ��new�������д�������SqlSessionFacotryBuilder,
			// Ҳ����SqlSessionFactory�Ľ����ߣ�SqlSessionFactory�Ĺ��ܾ����������ݿ⣬��ȡ����
			// ��ΪSqlMapConfig.xml�ļ�����db.properties�����ļ������Ի���س����ݿ��driver,url,username,password;���и����������ӳ��mapper
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));

			// 2.��ȡSqlSession�ӿ�,��SqlSessionFactory��һ��
			SqlSession session = ssf.openSession();

			// 3.ִ������
			// ����1��Ҫִ����һ����ѯ��䣬�Ͱ�������ѯ����id������
			// ����2��ִ�е�ʱ�򣬴���new��һ��studentʵ�����ȡ������Ϣ���Ӷ���ɲ���

			int result = session.delete("deleteStudent", id);
			// 4.�ύ��������ɾ�Ķ���Ҫ
			session.commit();

			// 5.�ر����ӣ��ͷ���Դ
			session.close();

			// 6.���ؽ��
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}
