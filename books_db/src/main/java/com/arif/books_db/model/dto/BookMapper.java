package com.arif.books_db.model.dto;

import com.arif.books_db.model.pojos.Book;

public interface BookMapper {
    BookDto toBookDto(Book book);
    Book toBook(BookDto bookDto);
}
