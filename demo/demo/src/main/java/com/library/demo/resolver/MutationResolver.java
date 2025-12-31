package com.library.demo.resolver;

import com.library.demo.dto.BookInput;
import com.library.demo.model.Author;
import com.library.demo.model.Book;
import com.library.demo.model.Category;
import com.library.demo.repository.AuthorRepository;
import com.library.demo.repository.BookRepository;
import com.library.demo.repository.CategoryRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

@Controller
public class MutationResolver {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CategoryRepository categoryRepository;

    public MutationResolver(BookRepository bookRepository, 
                          AuthorRepository authorRepository,
                          CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
    }

    @MutationMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Book addBook(@Argument BookInput input) {
        // Validate author exists
        Author author = authorRepository.findById(input.getAuthorId())
            .orElseThrow(() -> new RuntimeException("Author not found with id: " + input.getAuthorId()));
        
        // Validate category exists
        Category category = categoryRepository.findById(input.getCategoryId())
            .orElseThrow(() -> new RuntimeException("Category not found with id: " + input.getCategoryId()));
        
        // Create new book
        Book book = new Book();
        book.setTitle(input.getTitle());
        book.setPublicationYear(input.getPublicationYear());
        book.setLanguage(input.getLanguage());
        book.setNbPages(input.getNbPages());
        book.setAuthor(author);
        book.setCategory(category);
        
        return bookRepository.save(book);
    }

    @MutationMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Boolean deleteAuthor(@Argument Long id) {
        if (!authorRepository.existsById(id)) {
            throw new RuntimeException("Author not found with id: " + id);
        }
        
        // Delete author (cascade will delete all their books)
        authorRepository.deleteById(id);
        return true;
    }
}