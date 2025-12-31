package com.library.demo.service;

import com.library.demo.model.Book;
import com.library.demo.model.Category;
import com.library.demo.repository.BookRepository;
import com.library.demo.repository.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;

    public BookService(BookRepository bookRepository, CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
    }

    public Page<Book> getAllBooks(int page, int size, Integer year, String language, Long categoryId, boolean recursive) {
        Pageable pageable = PageRequest.of(page, size);
        
        // If recursive is true and categoryId is provided, get all subcategories
        if (recursive && categoryId != null) {
            Optional<Category> categoryOpt = categoryRepository.findById(categoryId);
            if (categoryOpt.isPresent()) {
                List<Category> categories = getAllSubCategories(categoryOpt.get());
                categories.add(categoryOpt.get()); // Include the parent category
                return bookRepository.findByCategoryIn(categories, pageable);
            }
        }
        
        // Otherwise use regular filters
        return bookRepository.findWithFilters(categoryId, year, language, pageable);
    }

    public Page<Book> getBooksByAuthor(Long authorId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return bookRepository.findByAuthor_IdA(authorId, pageable);
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> searchBooks(String keyword) {
        return bookRepository.searchByTitle(keyword);
    }

    // Helper method to get all subcategories recursively
    private List<Category> getAllSubCategories(Category category) {
        List<Category> allCategories = new ArrayList<>();
        List<Category> subCategories = categoryRepository.findByParentCategory(category);
        
        for (Category subCategory : subCategories) {
            allCategories.add(subCategory);
            allCategories.addAll(getAllSubCategories(subCategory)); // Recursive call
        }
        
        return allCategories;
    }
}