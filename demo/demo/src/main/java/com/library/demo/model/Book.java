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
    
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
    
    // Manual setters if Lombok fails
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public void setNbPages(Integer nbPages) {
        this.nbPages = nbPages;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
}