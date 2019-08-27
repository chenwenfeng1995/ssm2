package cn.sz.gl.dao;

import java.util.List;

import cn.sz.gl.pojo.Book;

public interface IBookDAO {

	public List<Book> findallbook();
	
	public Book findBookById(Integer bookid);
}
