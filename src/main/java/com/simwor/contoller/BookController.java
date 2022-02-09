package com.simwor.contoller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.simwor.bean.Book;
import com.simwor.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/api/booker/query-book-by-isbn")
    public Book queryBookByISBN(@RequestParam("isbn") String isbn) {
        return bookMapper.selectById(isbn);
    }

    @GetMapping("/api/booker/query-books-by-title")
    public List<Book> queryBooksByTitle(@RequestParam("title") String title) {
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("*").like("title", title);
        return bookMapper.selectList(queryWrapper);
    }

}
