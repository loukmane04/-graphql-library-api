package com.library.demo.config;

import com.library.demo.model.Author;
import com.library.demo.model.Book;
import com.library.demo.model.Category;
import com.library.demo.repository.AuthorRepository;
import com.library.demo.repository.BookRepository;
import com.library.demo.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  // Changed from @Configuration
public class DataLoader implements CommandLineRunner {

    private final CategoryRepository categoryRepo;
    private final AuthorRepository authorRepo;
    private final BookRepository bookRepo;

    public DataLoader(CategoryRepository categoryRepo, 
                     AuthorRepository authorRepo,
                     BookRepository bookRepo) {
        this.categoryRepo = categoryRepo;
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("🔄 Loading initial data...");
        
        // ============ CATEGORIES (20) ============
        Category fiction = categoryRepo.save(createCategory("Fiction", null));
        Category nonFiction = categoryRepo.save(createCategory("Non-Fiction", null));
        Category science = categoryRepo.save(createCategory("Science", null));
        Category technology = categoryRepo.save(createCategory("Technology", null));
        Category history = categoryRepo.save(createCategory("History", null));
        
        Category scienceFiction = categoryRepo.save(createCategory("Science Fiction", fiction));
        Category fantasy = categoryRepo.save(createCategory("Fantasy", fiction));
        Category mystery = categoryRepo.save(createCategory("Mystery", fiction));
        Category romance = categoryRepo.save(createCategory("Romance", fiction));
        Category biography = categoryRepo.save(createCategory("Biography", nonFiction));
        
        System.out.println("✅ Created 10 categories");
        
        // ============ AUTHORS (10 for testing) ============
        Author orwell = authorRepo.save(createAuthor("George Orwell", 46, "British"));
        Author austen = authorRepo.save(createAuthor("Jane Austen", 41, "British"));
        Author asimov = authorRepo.save(createAuthor("Isaac Asimov", 72, "American"));
        Author rowling = authorRepo.save(createAuthor("J.K. Rowling", 59, "British"));
        Author king = authorRepo.save(createAuthor("Stephen King", 77, "American"));
        Author christie = authorRepo.save(createAuthor("Agatha Christie", 85, "British"));
        Author marquez = authorRepo.save(createAuthor("Gabriel García Márquez", 87, "Colombian"));
        Author murakami = authorRepo.save(createAuthor("Haruki Murakami", 75, "Japanese"));
        Author tolkien = authorRepo.save(createAuthor("J.R.R. Tolkien", 81, "British"));
        Author bradbury = authorRepo.save(createAuthor("Ray Bradbury", 91, "American"));
        
        System.out.println("✅ Created 10 authors");
        
        // ============ BOOKS (20 for testing) ============
        bookRepo.save(createBook("1984", 1949, "English", 328, fiction, orwell));
        bookRepo.save(createBook("Animal Farm", 1945, "English", 112, fiction, orwell));
        bookRepo.save(createBook("Pride and Prejudice", 1813, "English", 432, fiction, austen));
        bookRepo.save(createBook("Foundation", 1951, "English", 255, scienceFiction, asimov));
        bookRepo.save(createBook("I Robot", 1950, "English", 224, scienceFiction, asimov));
        bookRepo.save(createBook("Harry Potter", 1997, "English", 223, fantasy, rowling));
        bookRepo.save(createBook("The Shining", 1977, "English", 447, mystery, king));
        bookRepo.save(createBook("It", 1986, "English", 1138, mystery, king));
        bookRepo.save(createBook("Murder on the Orient Express", 1934, "English", 256, mystery, christie));
        bookRepo.save(createBook("One Hundred Years of Solitude", 1967, "Spanish", 417, fiction, marquez));
        bookRepo.save(createBook("Norwegian Wood", 1987, "Japanese", 296, fiction, murakami));
        bookRepo.save(createBook("The Hobbit", 1937, "English", 310, fantasy, tolkien));
        bookRepo.save(createBook("Lord of the Rings", 1954, "English", 1178, fantasy, tolkien));
        bookRepo.save(createBook("Fahrenheit 451", 1953, "English", 158, scienceFiction, bradbury));
        bookRepo.save(createBook("The Martian Chronicles", 1950, "English", 222, scienceFiction, bradbury));
        bookRepo.save(createBook("Sense and Sensibility", 1811, "English", 409, romance, austen));
        bookRepo.save(createBook("Carrie", 1974, "English", 199, mystery, king));
        bookRepo.save(createBook("The Stand", 1978, "English", 823, mystery, king));
        bookRepo.save(createBook("And Then There Were None", 1939, "English", 272, mystery, christie));
        bookRepo.save(createBook("Foundation and Empire", 1952, "English", 247, scienceFiction, asimov));
        
        System.out.println("✅ Created 20 books");
        System.out.println("🎉 Database initialized successfully!");
    }
    
    private Category createCategory(String name, Category parent) {
        Category category = new Category();
        category.setCategoryName(name);
        category.setParentCategory(parent);
        return category;
    }
    
    private Author createAuthor(String name, int age, String nationality) {
        Author author = new Author();
        author.setName(name);
        author.setAge(age);
        author.setNationality(nationality);
        return author;
    }
    
    private Book createBook(String title, int year, String language, int pages, Category category, Author author) {
        Book book = new Book();
        book.setTitle(title);
        book.setPublicationYear(year);
        book.setLanguage(language);
        book.setNbPages(pages);
        book.setCategory(category);
        book.setAuthor(author);
        return book;
    }
}