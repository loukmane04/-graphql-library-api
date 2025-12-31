package com.library.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;
    
    @Column(nullable = false)
    private String categoryName;
    
    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    @JsonIgnoreProperties("subCategories")
    private Category parentCategory;
    
    @OneToMany(mappedBy = "parentCategory")
    @JsonIgnoreProperties("parentCategory")
    private List<Category> subCategories = new ArrayList<>();
    
    @OneToMany(mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Book> books = new ArrayList<>();
    
    // Getters
    public Long getIdC() {
        return idC;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public Category getParentCategory() {
        return parentCategory;
    }
    
    public List<Category> getSubCategories() {
        return subCategories;
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    // Setters
    public void setIdC(Long idC) {
        this.idC = idC;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }
    
    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}