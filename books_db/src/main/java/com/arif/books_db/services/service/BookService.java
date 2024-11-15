package com.arif.books_db.services.service;

import com.arif.books_db.model.pojos.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();

    Book create(Book book);

    void deleteBook(Long id);
}
