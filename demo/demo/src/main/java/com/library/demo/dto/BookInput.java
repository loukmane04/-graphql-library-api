package com.library.demo.dto;

public class BookInput {
    private String title;
    private Integer publicationYear;
    private String language;
    private Integer nbPages;
    private Long categoryId;
    private Long authorId;
    
    // Constructors
    public BookInput() {}
    
    public BookInput(String title, Integer publicationYear, String language, 
                     Integer nbPages, Long categoryId, Long authorId) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.language = language;
        this.nbPages = nbPages;
        this.categoryId = categoryId;
        this.authorId = authorId;
    }
    
    // Getters
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
    
    public Long getCategoryId() {
        return categoryId;
    }
    
    public Long getAuthorId() {
        return authorId;
    }
    
    // Setters
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
    
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}