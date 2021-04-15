package com.mf.controller;

import com.mf.pojo.Books;
import com.mf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-13-23:06
 */
@Controller
@RequestMapping("/book")
public class BooksController {
    //controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    //查询全部书籍并返回到书籍张氏页面
    @RequestMapping("/allBooks")
    public String list(Model model){
        List<Books> books = bookService.selectAllBook();
        model.addAttribute("books",books);
        return "allBooks";
    }
    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String add(){
        return "toAddBook";
    }
    //增加书籍
    @RequestMapping("/AddBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        int i = bookService.addBook(books);
        System.out.println(i);
        return "redirect:/book/allBooks";//可以重定向到页面或者直接重定向到请求
    }
    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String update(int id,Model model){
        Books books = bookService.selectBookById(id);
        model.addAttribute("UPBook",books);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("addBook=>"+books);
        int i = bookService.updateBook(books);
        System.out.println(i);
        return "redirect:/book/allBooks";
    }
    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")//采用Restful风格
    public String deleteBook(@PathVariable("bookID")int id){
        int i = bookService.deleteBook(id);
        System.out.println(i);
        return "redirect:/book/allBooks";
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String QUbookname,Model model){
        System.out.println(QUbookname);
        Books books = bookService.selectBookByName(QUbookname);
        if(books==null){
            model.addAttribute("error","不存在此书籍！");
        }
        System.out.println(books);
        model.addAttribute("books",books);
        return "queryBook";
    }
}
