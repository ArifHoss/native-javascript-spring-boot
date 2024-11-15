package com.arif.books_db.services.implementation;

import com.arif.books_db.exception.ConflictException;
import com.arif.books_db.model.pojos.Book;
import com.arif.books_db.repository.BookRepository;
import com.arif.books_db.services.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book create(Book book) {
        String title = book.getTitle();
        boolean existsBookByTitle = bookRepository.existsBookByTitle(title);
        if (existsBookByTitle) {
//            throw new ResponseStatusException(HttpStatus.CONFLICT, "BOOK WITH THIS TITLE ALREADY EXIST");
            throw new ConflictException("BOOK WITH THIS TITLE ALREADY EXIST");
        }
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
//        Optional<Book> book = bookRepository.findById(id);
        bookRepository.deleteById(id);
    }
}
