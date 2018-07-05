package cn.edu.scau.cmi.zhouxudong.DAO;

import cn.edu.scau.cmi.zhouxudong.domain.*;

public interface BookDao {
	void newBook(Book book);
	void deleteBook(Book book);
	void findBook(Book book);
	void updateBook(Book book);
}
