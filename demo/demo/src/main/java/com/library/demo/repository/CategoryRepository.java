package com.library.demo.repository;

import com.library.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    // Find all subcategories of a category
    List<Category> findByParentCategory(Category parentCategory);
    
    // Search categories by name
    @Query("SELECT c FROM Category c WHERE LOWER(c.categoryName) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Category> searchByName(@Param("keyword") String keyword);
    
    // Find root categories (no parent)
    List<Category> findByParentCategoryIsNull();
}