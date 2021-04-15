package com.mf.dao;

import com.mf.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-13-17:53
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(@Param("bookID") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books selectBookById(@Param("bookID")int id);
    //查询全部书
    List<Books> selectAllBook();
    //查询一本书byName
    Books selectBookByName(@Param("bookname") String bookname);

}
