package com.library.demo.dto;

import com.library.demo.model.Author;
import com.library.demo.model.Book;
import com.library.demo.model.Category;

import java.util.List;

public class SearchFilter {
    private List<Book> books;
    private List<Author> authors;
    private List<Category> categories;
    private int totalResults;
    
    public SearchFilter(List<Book> books, List<Author> authors, 
                       List<Category> categories, int totalResults) {
        this.books = books;
        this.authors = authors;
        this.categories = categories;
        this.totalResults = totalResults;
    }
    
    // Getters
    public List<Book> getBooks() { return books; }
    public List<Author> getAuthors() { return authors; }
    public List<Category> getCategories() { return categories; }
    public int getTotalResults() { return totalResults; }
}