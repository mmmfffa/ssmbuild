package com.mf.service;

import com.mf.dao.BookMapper;
import com.mf.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-13-21:11
 */
public class BookServiceImpl implements BookService
{
    //service层调dao层：组合dao层
    private BookMapper bookMapper;
    //通过set注入
    //@Autowired
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public List<Books> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public Books selectBookByName(String bookname) {
        return bookMapper.selectBookByName(bookname);
    }

}
