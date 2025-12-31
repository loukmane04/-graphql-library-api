package com.library.demo.resolver;

import com.library.demo.dto.PageInfo;  // Changed from BookPageDto
import com.library.demo.dto.SearchFilter;  // Changed from SearchResultDto
import com.library.demo.model.Author;
import com.library.demo.model.Book;
import com.library.demo.model.Category;
import com.library.demo.service.AuthorService;
import com.library.demo.service.BookService;
import com.library.demo.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class QueryResolver {

    private final BookService bookService;
    private final AuthorService authorService;
    private final CategoryService categoryService;

    public QueryResolver(BookService bookService, AuthorService authorService, CategoryService categoryService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.categoryService = categoryService;
    }

    @QueryMapping
    public PageInfo books(
            @Argument Integer page,
            @Argument Integer size,
            @Argument Integer publicationYear,
            @Argument String language,
            @Argument Long categoryId,
            @Argument Boolean recursive) {
        
        int pageNum = page != null ? page : 0;
        int pageSize = size != null ? size : 10;
        boolean isRecursive = recursive != null ? recursive : false;
        
        Page<Book> bookPage = bookService.getAllBooks(pageNum, pageSize, publicationYear, language, categoryId, isRecursive);
        return PageInfo.from(bookPage);  // Changed
    }

    @QueryMapping
    public Book book(@Argument Long id) {
        return bookService.getBookById(id).orElse(null);
    }

    @QueryMapping
    public PageInfo booksByAuthor(@Argument Long authorId, @Argument Integer page, @Argument Integer size) {
        int pageNum = page != null ? page : 0;
        int pageSize = size != null ? size : 10;
        
        Page<Book> bookPage = bookService.getBooksByAuthor(authorId, pageNum, pageSize);
        return PageInfo.from(bookPage);  // Changed
    }

    @QueryMapping
    public SearchFilter search(@Argument String keyword, @Argument Integer page, @Argument Integer size) {
        List<Book> books = bookService.searchBooks(keyword);
        List<Author> authors = authorService.searchAuthors(keyword);
        List<Category> categories = categoryService.searchCategories(keyword);
        
        int totalResults = books.size() + authors.size() + categories.size();
        
        return new SearchFilter(books, authors, categories, totalResults);  // Changed
    }

    @QueryMapping
    public Author author(@Argument Long id) {
        return authorService.getAuthorById(id).orElse(null);
    }

    @QueryMapping
    public List<Author> authors() {
        return authorService.getAllAuthors();
    }

    @QueryMapping
    public Category category(@Argument Long id) {
        return categoryService.getCategoryById(id).orElse(null);
    }

    @QueryMapping
    public List<Category> categories() {
        return categoryService.getAllCategories();
    }
}