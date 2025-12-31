package com.library.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    @JsonIgnoreProperties("books")
    private Category category;
    
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    @JsonIgnoreProperties("books")
    private Author author;
    
    // Getters
    public Long getIdBook() {
        return idBook;
    }
    
    public String getTitle() {
        return title;
    }
    
    public Integer getPublicationYear() {
        return publicationYear;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public Integer getNbPages() {
        return nbPages;
    }
    
    public Category getCategory() {
        return category;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    // Setters
    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }
    
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