package com.arif.books_db.controllers;

import com.arif.books_db.model.pojos.Book;
import com.arif.books_db.model.dto.BookDto;
import com.arif.books_db.model.dto.BookMapper;
import com.arif.books_db.services.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    private final BookMapper bookMapper;

    @GetMapping
    public List<BookDto> getAllBooks(){
        List<Book> books = bookService.getAllBook();
        return books.stream().map(bookMapper::toBookDto).collect(Collectors.toList());
    }

    @PostMapping
    public BookDto createBook(@RequestBody BookDto bookDto) {
        Book book = bookMapper.toBook(bookDto);
        return bookMapper.toBookDto(bookService.create(book));
    }

    @DeleteMapping("{id}")
    public String deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
        return "Book Deleted";
    }
}
