package com.library.demo.repository;

import com.library.demo.model.Book;
import com.library.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
    // Find books by author with pagination
    Page<Book> findByAuthor_IdA(Long authorId, Pageable pageable);
    
    // Find books by category with pagination
    Page<Book> findByCategory(Category category, Pageable pageable);
    
    // Find books by category with filters
    @Query("SELECT b FROM Book b WHERE " +
           "(:categoryId IS NULL OR b.category.idC = :categoryId) AND " +
           "(:year IS NULL OR b.publicationYear = :year) AND " +
           "(:language IS NULL OR LOWER(b.language) = LOWER(:language))")
    Page<Book> findWithFilters(
        @Param("categoryId") Long categoryId,
        @Param("year") Integer year,
        @Param("language") String language,
        Pageable pageable
    );
    
    // Search books by title
    @Query("SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Book> searchByTitle(@Param("keyword") String keyword);
    
    // Find books in a list of categories (for recursive search)
    Page<Book> findByCategoryIn(List<Category> categories, Pageable pageable);
}