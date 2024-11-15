package com.arif.books_db.model.dto;

import lombok.Data;

@Data
public class BookDto {
    private long id;
    private String title;
    private String coverImage;
    private String description;
    private String releaseDate;
    private String pages;
    private String genre;
}
