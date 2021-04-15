package com.mf.service;

import com.mf.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-13-21:10
 */
@Service
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books selectBookById(int id);
    //查询全部书
    List<Books> selectAllBook();
    //查询一本书byName
    Books selectBookByName(String bookname);
}
