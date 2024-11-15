package com.arif.books_db.model.dto;

import com.arif.books_db.model.pojos.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMapperImpl implements BookMapper{
    @Override
    public BookDto toBookDto(Book book) {
        BookDto dto = new BookDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setCoverImage(book.getCoverImage());
        dto.setDescription(book.getDescription());
        dto.setReleaseDate(book.getReleaseDate());
        dto.setPages(book.getPages());
        dto.setGenre(book.getGenre());
        return dto;
    }

    @Override
    public Book toBook(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setCoverImage(bookDto.getCoverImage());
        book.setDescription(bookDto.getDescription());
        book.setReleaseDate(bookDto.getReleaseDate());
        book.setPages(bookDto.getPages());
        book.setGenre(bookDto.getGenre());
        return book;
    }
}
