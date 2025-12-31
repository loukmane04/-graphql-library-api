package com.library.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idA;
    
    @Column(nullable = false)
    private String name;
    
    private Integer age;
    
    private String nationality;
    
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("author")
    private List<Book> books = new ArrayList<>();
    
    // Getters
    public Long getIdA() {
        return idA;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public String getNationality() {
        return nationality;
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    // Setters
    public void setIdA(Long idA) {
        this.idA = idA;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}