package com.library.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
    private Category parentCategory;
    
    @OneToMany(mappedBy = "parentCategory")
    private List<Category> subCategories = new ArrayList<>();
    
    @OneToMany(mappedBy = "category")
    private List<Book> books = new ArrayList<>();
}