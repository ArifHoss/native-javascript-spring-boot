package com.arif.books_db.repository;

import com.arif.books_db.model.pojos.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    boolean existsBookByTitle(String title);
}
