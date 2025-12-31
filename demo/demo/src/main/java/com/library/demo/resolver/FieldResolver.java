package com.library.demo.resolver;

import com.library.demo.model.Author;
import com.library.demo.model.Book;
import com.library.demo.model.Category;
import com.library.demo.repository.AuthorRepository;
import com.library.demo.repository.BookRepository;
import com.library.demo.repository.CategoryRepository;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FieldResolver {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CategoryRepository categoryRepository;

    public FieldResolver(BookRepository bookRepository, 
                        AuthorRepository authorRepository,
                        CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
    }

    // Resolve Author fields
    @SchemaMapping(typeName = "Author", field = "books")
    public List<Book> authorBooks(Author author) {
        return bookRepository.findByAuthor_IdA(author.getIdA(), org.springframework.data.domain.Pageable.unpaged()).getContent();
    }

    // Resolve Category fields
    @SchemaMapping(typeName = "Category", field = "books")
    public List<Book> categoryBooks(Category category) {
        return bookRepository.findByCategory(category, org.springframework.data.domain.Pageable.unpaged()).getContent();
    }

    @SchemaMapping(typeName = "Category", field = "subCategories")
    public List<Category> categorySubCategories(Category category) {
        return categoryRepository.findByParentCategory(category);
    }

    @SchemaMapping(typeName = "Category", field = "parentCategory")
    public Category categoryParentCategory(Category category) {
        return category.getParentCategory();
    }

    // Resolve Book fields
    @SchemaMapping(typeName = "Book", field = "author")
    public Author bookAuthor(Book book) {
        return book.getAuthor();
    }

    @SchemaMapping(typeName = "Book", field = "category")
    public Category bookCategory(Book book) {
        return book.getCategory();
    }
}