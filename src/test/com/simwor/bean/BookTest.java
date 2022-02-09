package com.simwor.bean;

import com.simwor.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testMethod_insert() {
        // Set up
        Book book = new Book();
        book.setIsbn("1234567890");
        book.setTitle("test");
        book.setAuthor("test");
        book.setPublisher("test");
        book.setProducer("test");
        book.setSubtitle("test");
        book.setPrimalName("test");
        book.setTranslator("test");
        book.setPublished("test");
        book.setPages(400);
        book.setPrice("test");
        book.setBinding("test");
        book.setSeries("test");
        book.setCoverImageUrl("test");
        book.setDigest("test");

        // Run
        bookMapper.deleteById(book.getIsbn());
        bookMapper.insert(book);

        // Clear
        bookMapper.deleteById(book.getIsbn());
    }

}
