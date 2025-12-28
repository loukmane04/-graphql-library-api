package com.library.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
<<<<<<< HEAD
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    
    @Column(nullable = false)
    private String title;
    
    private Integer publicationYear;
    
    private String language;
    
    private Integer nbPages;
    
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    
=======

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;

    @Column(nullable = false)
    private String title;

    private Integer publicationYear;

    private String language;

    private Integer nbPages;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

>>>>>>> add6a155b4d80bcf79660ce32ded63acc0cf4f70
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}