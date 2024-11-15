package com.arif.books_db.exception;

public class NonUniqueResultException extends RuntimeException{
    public NonUniqueResultException(String message) {
        super(message);
    }
}
