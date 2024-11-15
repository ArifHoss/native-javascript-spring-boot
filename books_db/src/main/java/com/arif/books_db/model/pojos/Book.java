package com.arif.books_db.model.pojos;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String coverImage;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String releaseDate;
    private String pages;
    private String genre;

}
