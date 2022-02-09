package com.simwor.contoller;

import com.simwor.bean.Book;
import com.simwor.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/api/booker/query-book-by-isbn")
    public Book queryBookByISBN(@RequestParam("isbn") String isbn) {
        return bookMapper.selectById(isbn);
    }

}
