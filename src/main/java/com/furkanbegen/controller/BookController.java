package com.furkanbegen.controller;

import com.furkanbegen.domain.Book;
import com.furkanbegen.repository.BookRepository;
import com.furkanbegen.service.DefaultBookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Furkan BEĞEN on 3.12.2017.
 */
@RestController
@RequestMapping("/books")
public class BookController {

    private DefaultBookService bookService;

    public BookController(DefaultBookService bookService){
        this.bookService = bookService;
    }

    @RequestMapping("/")
    public Iterable<Book> list(){
        return bookService.list();
    }
}
