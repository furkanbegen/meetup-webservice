package com.furkanbegen.service.impl;

import com.furkanbegen.domain.Book;
import com.furkanbegen.repository.BookRepository;
import com.furkanbegen.service.DefaultBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Furkan BEĞEN on 3.12.2017.
 */
@Service
public class BookService implements DefaultBookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> list() {
        return  bookRepository.findAll();
    }

    @Override
    @Transactional
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book read(Long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public Book update(Long id, Book update) {
        return bookRepository.save(update);
    }

    @Override
    public void delete(Long id) {
        bookRepository.delete(id);
    }
}
