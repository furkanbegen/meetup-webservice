package com.furkanbegen.repository;

import com.furkanbegen.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Furkan BEĞEN on 3.12.2017.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
