package cn.sz.gl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.gl.dao.IBookDAO;
import cn.sz.gl.pojo.Book;
import cn.sz.gl.service.IBookService;
@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookDAO bookdao;
	
	public List<Book> findall() {
		return bookdao.findallbook();
	}

	public Book findBookById(Integer bookid) {
		if(bookid==null){
			return null;
		}
		return bookdao.findBookById(bookid);
	}

}
