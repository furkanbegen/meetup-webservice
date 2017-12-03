package com.furkanbegen.service;

import com.furkanbegen.domain.Book;

/**
 * Created by Furkan BEĞEN on 3.12.2017.
 */
public interface DefaultBookService {

    Iterable<Book> list();

    Book create(Book book);

    Book read(Long id);

    Book update(Long id,  Book update);

    void delete(Long id);
}
