package com.library.demo.config;

import com.library.demo.model.Author;
import com.library.demo.model.Book;
import com.library.demo.model.Category;
import com.library.demo.repository.AuthorRepository;
import com.library.demo.repository.BookRepository;
import com.library.demo.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
        List<Category> categories = new ArrayList<>();
        
        // Root categories
        categories.add(categoryRepo.save(createCategory("Fiction", null)));
        categories.add(categoryRepo.save(createCategory("Non-Fiction", null)));
        categories.add(categoryRepo.save(createCategory("Science", null)));
        categories.add(categoryRepo.save(createCategory("Technology", null)));
        categories.add(categoryRepo.save(createCategory("History", null)));
        categories.add(categoryRepo.save(createCategory("Arts", null)));
        categories.add(categoryRepo.save(createCategory("Business", null)));
        categories.add(categoryRepo.save(createCategory("Health", null)));
        
        // Subcategories
        categories.add(categoryRepo.save(createCategory("Science Fiction", categories.get(0))));
        categories.add(categoryRepo.save(createCategory("Fantasy", categories.get(0))));
        categories.add(categoryRepo.save(createCategory("Mystery", categories.get(0))));
        categories.add(categoryRepo.save(createCategory("Romance", categories.get(0))));
        categories.add(categoryRepo.save(createCategory("Biography", categories.get(1))));
        categories.add(categoryRepo.save(createCategory("Self-Help", categories.get(1))));
        categories.add(categoryRepo.save(createCategory("Physics", categories.get(2))));
        categories.add(categoryRepo.save(createCategory("Biology", categories.get(2))));
        categories.add(categoryRepo.save(createCategory("Computer Science", categories.get(3))));
        categories.add(categoryRepo.save(createCategory("Programming", categories.get(3))));
        categories.add(categoryRepo.save(createCategory("Web Development", categories.get(3))));
        categories.add(categoryRepo.save(createCategory("Ancient History", categories.get(4))));
        
        System.out.println("✅ Created 20 categories");
        
        // ============ AUTHORS (70) ============
        List<Author> authors = new ArrayList<>();
        
        // Classic Authors (10)
        authors.add(authorRepo.save(createAuthor("George Orwell", 46, "British")));
        authors.add(authorRepo.save(createAuthor("Jane Austen", 41, "British")));
        authors.add(authorRepo.save(createAuthor("Mark Twain", 74, "American")));
        authors.add(authorRepo.save(createAuthor("Charles Dickens", 58, "British")));
        authors.add(authorRepo.save(createAuthor("Leo Tolstoy", 82, "Russian")));
        authors.add(authorRepo.save(createAuthor("Fyodor Dostoevsky", 59, "Russian")));
        authors.add(authorRepo.save(createAuthor("Ernest Hemingway", 61, "American")));
        authors.add(authorRepo.save(createAuthor("Virginia Woolf", 59, "British")));
        authors.add(authorRepo.save(createAuthor("James Joyce", 58, "Irish")));
        authors.add(authorRepo.save(createAuthor("Franz Kafka", 40, "Czech")));
        
        // Contemporary Fiction (10)
        authors.add(authorRepo.save(createAuthor("Gabriel García Márquez", 87, "Colombian")));
        authors.add(authorRepo.save(createAuthor("Haruki Murakami", 75, "Japanese")));
        authors.add(authorRepo.save(createAuthor("Chimamanda Ngozi Adichie", 47, "Nigerian")));
        authors.add(authorRepo.save(createAuthor("Salman Rushdie", 77, "British-Indian")));
        authors.add(authorRepo.save(createAuthor("Margaret Atwood", 85, "Canadian")));
        authors.add(authorRepo.save(createAuthor("Toni Morrison", 88, "American")));
        authors.add(authorRepo.save(createAuthor("Khaled Hosseini", 59, "Afghan-American")));
        authors.add(authorRepo.save(createAuthor("Yann Martel", 61, "Canadian")));
        authors.add(authorRepo.save(createAuthor("Arundhati Roy", 63, "Indian")));
        authors.add(authorRepo.save(createAuthor("Kazuo Ishiguro", 70, "British-Japanese")));
        
        // Science Fiction & Fantasy (15)
        authors.add(authorRepo.save(createAuthor("Isaac Asimov", 72, "American")));
        authors.add(authorRepo.save(createAuthor("Arthur C. Clarke", 90, "British")));
        authors.add(authorRepo.save(createAuthor("Ursula K. Le Guin", 88, "American")));
        authors.add(authorRepo.save(createAuthor("Philip K. Dick", 53, "American")));
        authors.add(authorRepo.save(createAuthor("Ray Bradbury", 91, "American")));
        authors.add(authorRepo.save(createAuthor("Frank Herbert", 65, "American")));
        authors.add(authorRepo.save(createAuthor("Octavia Butler", 58, "American")));
        authors.add(authorRepo.save(createAuthor("Douglas Adams", 49, "British")));
        authors.add(authorRepo.save(createAuthor("Terry Pratchett", 66, "British")));
        authors.add(authorRepo.save(createAuthor("Brandon Sanderson", 49, "American")));
        authors.add(authorRepo.save(createAuthor("J.K. Rowling", 59, "British")));
        authors.add(authorRepo.save(createAuthor("Neil Gaiman", 64, "British")));
        authors.add(authorRepo.save(createAuthor("J.R.R. Tolkien", 81, "British")));
        authors.add(authorRepo.save(createAuthor("C.S. Lewis", 64, "British")));
        authors.add(authorRepo.save(createAuthor("George R.R. Martin", 76, "American")));
        
        // Mystery & Thriller (10)
        authors.add(authorRepo.save(createAuthor("Stephen King", 77, "American")));
        authors.add(authorRepo.save(createAuthor("Agatha Christie", 85, "British")));
        authors.add(authorRepo.save(createAuthor("Arthur Conan Doyle", 71, "British")));
        authors.add(authorRepo.save(createAuthor("Dan Brown", 60, "American")));
        authors.add(authorRepo.save(createAuthor("Gillian Flynn", 53, "American")));
        authors.add(authorRepo.save(createAuthor("Lee Child", 69, "British")));
        authors.add(authorRepo.save(createAuthor("James Patterson", 77, "American")));
        authors.add(authorRepo.save(createAuthor("Patricia Highsmith", 74, "American")));
        authors.add(authorRepo.save(createAuthor("Raymond Chandler", 70, "American")));
        authors.add(authorRepo.save(createAuthor("Dashiell Hammett", 66, "American")));
        
        // Non-Fiction (10)
        authors.add(authorRepo.save(createAuthor("Malcolm Gladwell", 61, "Canadian")));
        authors.add(authorRepo.save(createAuthor("Yuval Noah Harari", 48, "Israeli")));
        authors.add(authorRepo.save(createAuthor("Michelle Obama", 60, "American")));
        authors.add(authorRepo.save(createAuthor("Walter Isaacson", 72, "American")));
        authors.add(authorRepo.save(createAuthor("Stephen Hawking", 76, "British")));
        authors.add(authorRepo.save(createAuthor("Carl Sagan", 62, "American")));
        authors.add(authorRepo.save(createAuthor("Jared Diamond", 87, "American")));
        authors.add(authorRepo.save(createAuthor("Howard Zinn", 87, "American")));
        authors.add(authorRepo.save(createAuthor("Noam Chomsky", 96, "American")));
        authors.add(authorRepo.save(createAuthor("Hannah Arendt", 69, "German-American")));
        
        // Programming & Tech (10)
        authors.add(authorRepo.save(createAuthor("Robert C. Martin", 71, "American")));
        authors.add(authorRepo.save(createAuthor("Martin Fowler", 61, "British")));
        authors.add(authorRepo.save(createAuthor("Donald Knuth", 86, "American")));
        authors.add(authorRepo.save(createAuthor("Bjarne Stroustrup", 74, "Danish")));
        authors.add(authorRepo.save(createAuthor("Andrew Hunt", 60, "American")));
        authors.add(authorRepo.save(createAuthor("David Thomas", 62, "American")));
        authors.add(authorRepo.save(createAuthor("Kent Beck", 63, "American")));
        authors.add(authorRepo.save(createAuthor("Eric Evans", 58, "American")));
        authors.add(authorRepo.save(createAuthor("Joshua Bloch", 60, "American")));
        authors.add(authorRepo.save(createAuthor("Steve McConnell", 64, "American")));
        
        // Self-Help & Business (5)
        authors.add(authorRepo.save(createAuthor("Dale Carnegie", 66, "American")));
        authors.add(authorRepo.save(createAuthor("Stephen Covey", 79, "American")));
        authors.add(authorRepo.save(createAuthor("Simon Sinek", 51, "British-American")));
        authors.add(authorRepo.save(createAuthor("Brené Brown", 59, "American")));
        authors.add(authorRepo.save(createAuthor("James Clear", 37, "American")));
        
        System.out.println("✅ Created 70 authors");
        
        // ============ BOOKS (170) ============
        List<Book> books = new ArrayList<>();
        
        // Fiction - Classic (20 books)
        books.add(bookRepo.save(createBook("1984", 1949, "English", 328, categories.get(0), authors.get(0))));
        books.add(bookRepo.save(createBook("Animal Farm", 1945, "English", 112, categories.get(0), authors.get(0))));
        books.add(bookRepo.save(createBook("Pride and Prejudice", 1813, "English", 432, categories.get(0), authors.get(1))));
        books.add(bookRepo.save(createBook("Sense and Sensibility", 1811, "English", 409, categories.get(0), authors.get(1))));
        books.add(bookRepo.save(createBook("Adventures of Huckleberry Finn", 1884, "English", 366, categories.get(0), authors.get(2))));
        books.add(bookRepo.save(createBook("Tom Sawyer", 1876, "English", 274, categories.get(0), authors.get(2))));
        books.add(bookRepo.save(createBook("Great Expectations", 1861, "English", 505, categories.get(0), authors.get(3))));
        books.add(bookRepo.save(createBook("Oliver Twist", 1838, "English", 608, categories.get(0), authors.get(3))));
        books.add(bookRepo.save(createBook("War and Peace", 1869, "Russian", 1225, categories.get(0), authors.get(4))));
        books.add(bookRepo.save(createBook("Anna Karenina", 1877, "Russian", 864, categories.get(0), authors.get(4))));
        books.add(bookRepo.save(createBook("Crime and Punishment", 1866, "Russian", 671, categories.get(0), authors.get(5))));
        books.add(bookRepo.save(createBook("The Brothers Karamazov", 1880, "Russian", 796, categories.get(0), authors.get(5))));
        books.add(bookRepo.save(createBook("The Old Man and the Sea", 1952, "English", 127, categories.get(0), authors.get(6))));
        books.add(bookRepo.save(createBook("For Whom the Bell Tolls", 1940, "English", 471, categories.get(0), authors.get(6))));
        books.add(bookRepo.save(createBook("Mrs Dalloway", 1925, "English", 194, categories.get(0), authors.get(7))));
        books.add(bookRepo.save(createBook("To the Lighthouse", 1927, "English", 209, categories.get(0), authors.get(7))));
        books.add(bookRepo.save(createBook("Ulysses", 1922, "English", 730, categories.get(0), authors.get(8))));
        books.add(bookRepo.save(createBook("A Portrait of the Artist", 1916, "English", 253, categories.get(0), authors.get(8))));
        books.add(bookRepo.save(createBook("The Metamorphosis", 1915, "German", 201, categories.get(0), authors.get(9))));
        books.add(bookRepo.save(createBook("The Trial", 1925, "German", 255, categories.get(0), authors.get(9))));
        
        // Contemporary Fiction (20 books)
        books.add(bookRepo.save(createBook("One Hundred Years of Solitude", 1967, "Spanish", 417, categories.get(0), authors.get(10))));
        books.add(bookRepo.save(createBook("Love in the Time of Cholera", 1985, "Spanish", 348, categories.get(0), authors.get(10))));
        books.add(bookRepo.save(createBook("Norwegian Wood", 1987, "Japanese", 296, categories.get(0), authors.get(11))));
        books.add(bookRepo.save(createBook("Kafka on the Shore", 2002, "Japanese", 480, categories.get(0), authors.get(11))));
        books.add(bookRepo.save(createBook("Half of a Yellow Sun", 2006, "English", 433, categories.get(0), authors.get(12))));
        books.add(bookRepo.save(createBook("Americanah", 2013, "English", 477, categories.get(0), authors.get(12))));
        books.add(bookRepo.save(createBook("Midnights Children", 1981, "English", 647, categories.get(0), authors.get(13))));
        books.add(bookRepo.save(createBook("The Moors Last Sigh", 1995, "English", 434, categories.get(0), authors.get(13))));
        books.add(bookRepo.save(createBook("The Handmaids Tale", 1985, "English", 311, categories.get(0), authors.get(14))));
        books.add(bookRepo.save(createBook("Oryx and Crake", 2003, "English", 376, categories.get(0), authors.get(14))));
        books.add(bookRepo.save(createBook("Beloved", 1987, "English", 324, categories.get(0), authors.get(15))));
        books.add(bookRepo.save(createBook("Song of Solomon", 1977, "English", 337, categories.get(0), authors.get(15))));
        books.add(bookRepo.save(createBook("The Kite Runner", 2003, "English", 371, categories.get(0), authors.get(16))));
        books.add(bookRepo.save(createBook("A Thousand Splendid Suns", 2007, "English", 372, categories.get(0), authors.get(16))));
        books.add(bookRepo.save(createBook("Life of Pi", 2001, "English", 319, categories.get(0), authors.get(17))));
        books.add(bookRepo.save(createBook("Beatrice and Virgil", 2010, "English", 197, categories.get(0), authors.get(17))));
        books.add(bookRepo.save(createBook("The God of Small Things", 1997, "English", 340, categories.get(0), authors.get(18))));
        books.add(bookRepo.save(createBook("The Ministry of Utmost Happiness", 2017, "English", 449, categories.get(0), authors.get(18))));
        books.add(bookRepo.save(createBook("Never Let Me Go", 2005, "English", 288, categories.get(0), authors.get(19))));
        books.add(bookRepo.save(createBook("The Remains of the Day", 1989, "English", 258, categories.get(0), authors.get(19))));
        
        // Science Fiction (30 books)
        books.add(bookRepo.save(createBook("Foundation", 1951, "English", 255, categories.get(8), authors.get(20))));
        books.add(bookRepo.save(createBook("I Robot", 1950, "English", 224, categories.get(8), authors.get(20))));
        books.add(bookRepo.save(createBook("Foundation and Empire", 1952, "English", 247, categories.get(8), authors.get(20))));
        books.add(bookRepo.save(createBook("Second Foundation", 1953, "English", 210, categories.get(8), authors.get(20))));
        books.add(bookRepo.save(createBook("The Robots of Dawn", 1983, "English", 435, categories.get(8), authors.get(20))));
        books.add(bookRepo.save(createBook("2001 A Space Odyssey", 1968, "English", 297, categories.get(8), authors.get(21))));
        books.add(bookRepo.save(createBook("Rendezvous with Rama", 1973, "English", 256, categories.get(8), authors.get(21))));
        books.add(bookRepo.save(createBook("Childhoods End", 1953, "English", 214, categories.get(8), authors.get(21))));
        books.add(bookRepo.save(createBook("The Left Hand of Darkness", 1969, "English", 304, categories.get(8), authors.get(22))));
        books.add(bookRepo.save(createBook("The Dispossessed", 1974, "English", 387, categories.get(8), authors.get(22))));
        books.add(bookRepo.save(createBook("Do Androids Dream of Electric Sheep", 1968, "English", 210, categories.get(8), authors.get(23))));
        books.add(bookRepo.save(createBook("The Man in the High Castle", 1962, "English", 239, categories.get(8), authors.get(23))));
        books.add(bookRepo.save(createBook("Fahrenheit 451", 1953, "English", 158, categories.get(8), authors.get(24))));
        books.add(bookRepo.save(createBook("The Martian Chronicles", 1950, "English", 222, categories.get(8), authors.get(24))));
        books.add(bookRepo.save(createBook("Dune", 1965, "English", 688, categories.get(8), authors.get(25))));
        books.add(bookRepo.save(createBook("Dune Messiah", 1969, "English", 331, categories.get(8), authors.get(25))));
        books.add(bookRepo.save(createBook("Kindred", 1979, "English", 287, categories.get(8), authors.get(26))));
        books.add(bookRepo.save(createBook("Parable of the Sower", 1993, "English", 345, categories.get(8), authors.get(26))));
        books.add(bookRepo.save(createBook("The Hitchhikers Guide", 1979, "English", 224, categories.get(8), authors.get(27))));
        books.add(bookRepo.save(createBook("Restaurant at the End of Universe", 1980, "English", 250, categories.get(8), authors.get(27))));
        books.add(bookRepo.save(createBook("The Color of Magic", 1983, "English", 206, categories.get(8), authors.get(28))));
        books.add(bookRepo.save(createBook("Mort", 1987, "English", 272, categories.get(8), authors.get(28))));
        books.add(bookRepo.save(createBook("The Way of Kings", 2010, "English", 1007, categories.get(8), authors.get(29))));
        books.add(bookRepo.save(createBook("Words of Radiance", 2014, "English", 1087, categories.get(8), authors.get(29))));
        books.add(bookRepo.save(createBook("Enders Game", 1985, "English", 324, categories.get(8), authors.get(29))));
        books.add(bookRepo.save(createBook("Neuromancer", 1984, "English", 271, categories.get(8), authors.get(23))));
        books.add(bookRepo.save(createBook("Snow Crash", 1992, "English", 440, categories.get(8), authors.get(23))));
        books.add(bookRepo.save(createBook("The Time Machine", 1895, "English", 118, categories.get(8), authors.get(21))));
        books.add(bookRepo.save(createBook("Stranger in a Strange Land", 1961, "English", 525, categories.get(8), authors.get(25))));
        books.add(bookRepo.save(createBook("Foundation and Earth", 1986, "English", 528, categories.get(8), authors.get(20))));
        
        // Fantasy (20 books)
        books.add(bookRepo.save(createBook("Harry Potter Philosophers Stone", 1997, "English", 223, categories.get(9), authors.get(30))));
        books.add(bookRepo.save(createBook("Harry Potter Chamber of Secrets", 1998, "English", 251, categories.get(9), authors.get(30))));
        books.add(bookRepo.save(createBook("Harry Potter Prisoner of Azkaban", 1999, "English", 317, categories.get(9), authors.get(30))));
        books.add(bookRepo.save(createBook("Harry Potter Goblet of Fire", 2000, "English", 636, categories.get(9), authors.get(30))));
        books.add(bookRepo.save(createBook("Harry Potter Order of Phoenix", 2003, "English", 766, categories.get(9), authors.get(30))));
        books.add(bookRepo.save(createBook("American Gods", 2001, "English", 635, categories.get(9), authors.get(31))));
        books.add(bookRepo.save(createBook("Good Omens", 1990, "English", 288, categories.get(9), authors.get(31))));
        books.add(bookRepo.save(createBook("Coraline", 2002, "English", 162, categories.get(9), authors.get(31))));
        books.add(bookRepo.save(createBook("The Hobbit", 1937, "English", 310, categories.get(9), authors.get(32))));
        books.add(bookRepo.save(createBook("Lord of the Rings Fellowship", 1954, "English", 398, categories.get(9), authors.get(32))));
        books.add(bookRepo.save(createBook("Lord of the Rings Two Towers", 1954, "English", 352, categories.get(9), authors.get(32))));
        books.add(bookRepo.save(createBook("Lord of the Rings Return of King", 1955, "English", 416, categories.get(9), authors.get(32))));
        books.add(bookRepo.save(createBook("The Lion the Witch Wardrobe", 1950, "English", 206, categories.get(9), authors.get(33))));
        books.add(bookRepo.save(createBook("Prince Caspian", 1951, "English", 223, categories.get(9), authors.get(33))));
        books.add(bookRepo.save(createBook("A Game of Thrones", 1996, "English", 694, categories.get(9), authors.get(34))));
        books.add(bookRepo.save(createBook("A Clash of Kings", 1998, "English", 768, categories.get(9), authors.get(34))));
        books.add(bookRepo.save(createBook("A Storm of Swords", 2000, "English", 973, categories.get(9), authors.get(34))));
        books.add(bookRepo.save(createBook("Mistborn The Final Empire", 2006, "English", 541, categories.get(9), authors.get(29))));
        books.add(bookRepo.save(createBook("The Name of the Wind", 2007, "English", 662, categories.get(9), authors.get(29))));
        books.add(bookRepo.save(createBook("Stardust", 1999, "English", 248, categories.get(9), authors.get(31))));
        
        // Mystery & Thriller (20 books)
        books.add(bookRepo.save(createBook("The Shining", 1977, "English", 447, categories.get(10), authors.get(35))));
        books.add(bookRepo.save(createBook("It", 1986, "English", 1138, categories.get(10), authors.get(35))));
        books.add(bookRepo.save(createBook("Carrie", 1974, "English", 199, categories.get(10), authors.get(35))));
        books.add(bookRepo.save(createBook("The Stand", 1978, "English", 823, categories.get(10), authors.get(35))));
        books.add(bookRepo.save(createBook("Misery", 1987, "English", 320, categories.get(10), authors.get(35))));
        books.add(bookRepo.save(createBook("Murder on the Orient Express", 1934, "English", 256, categories.get(10), authors.get(36))));
        books.add(bookRepo.save(createBook("And Then There Were None", 1939, "English", 272, categories.get(10), authors.get(36))));
        books.add(bookRepo.save(createBook("Death on the Nile", 1937, "English", 288, categories.get(10), authors.get(36))));
        books.add(bookRepo.save(createBook("The Hound of Baskervilles", 1902, "English", 256, categories.get(10), authors.get(37))));
        books.add(bookRepo.save(createBook("A Study in Scarlet", 1887, "English", 123, categories.get(10), authors.get(37))));
        books.add(bookRepo.save(createBook("The Da Vinci Code", 2003, "English", 454, categories.get(10), authors.get(38))));
        books.add(bookRepo.save(createBook("Angels and Demons", 2000, "English", 616, categories.get(10), authors.get(38))));
        books.add(bookRepo.save(createBook("Gone Girl", 2012, "English", 419, categories.get(10), authors.get(39))));
        books.add(bookRepo.save(createBook("Sharp Objects", 2006, "English", 254, categories.get(10), authors.get(39))));
        books.add(bookRepo.save(createBook("Killing Floor", 1997, "English", 542, categories.get(10), authors.get(40))));
        books.add(bookRepo.save(createBook("Die Trying", 1998, "English", 470, categories.get(10), authors.get(40))));
        books.add(bookRepo.save(createBook("Along Came a Spider", 1993, "English", 435, categories.get(10), authors.get(41))));
        books.add(bookRepo.save(createBook("The Talented Mr Ripley", 1955, "English", 273, categories.get(10), authors.get(42))));
        books.add(bookRepo.save(createBook("The Big Sleep", 1939, "English", 231, categories.get(10), authors.get(43))));
        books.add(bookRepo.save(createBook("The Maltese Falcon", 1930, "English", 217, categories.get(10), authors.get(44))));
        
        // Non-Fiction & Biography (20 books)
        books.add(bookRepo.save(createBook("The Tipping Point", 2000, "English", 301, categories.get(13), authors.get(45))));
        books.add(bookRepo.save(createBook("Outliers", 2008, "English", 309, categories.get(13), authors.get(45))));
        books.add(bookRepo.save(createBook("Blink", 2005, "English", 296, categories.get(13), authors.get(45))));
        books.add(bookRepo.save(createBook("Sapiens", 2011, "English", 443, categories.get(13), authors.get(46))));
        books.add(bookRepo.save(createBook("Homo Deus", 2015,"English", 440, categories.get(13), authors.get(46))));
		books.add(bookRepo.save(createBook("21 Lessons for 21st Century", 2018, "English", 372, categories.get(13), authors.get(46))));
		books.add(bookRepo.save(createBook("Becoming", 2018, "English", 448, categories.get(12), authors.get(47))));
		books.add(bookRepo.save(createBook("Steve Jobs", 2011, "English", 656, categories.get(12), authors.get(48))));
		books.add(bookRepo.save(createBook("Einstein", 2007, "English", 704, categories.get(12), authors.get(48))));
		books.add(bookRepo.save(createBook("A Brief History of Time", 1988, "English", 256, categories.get(14), authors.get(49))));
		books.add(bookRepo.save(createBook("The Universe in a Nutshell", 2001, "English", 224, categories.get(14), authors.get(49))));
		books.add(bookRepo.save(createBook("Cosmos", 1980, "English", 365, categories.get(14), authors.get(50))));
		books.add(bookRepo.save(createBook("Pale Blue Dot", 1994, "English", 429, categories.get(14), authors.get(50))));
		books.add(bookRepo.save(createBook("Guns Germs and Steel", 1997, "English", 480, categories.get(15), authors.get(51))));
		books.add(bookRepo.save(createBook("Collapse", 2005, "English", 608, categories.get(15), authors.get(51))));
		books.add(bookRepo.save(createBook("A Peoples History US", 1980, "English", 729, categories.get(19), authors.get(52))));
		books.add(bookRepo.save(createBook("Manufacturing Consent", 1988, "English", 412, categories.get(13), authors.get(53))));
		books.add(bookRepo.save(createBook("The Origins of Totalitarianism", 1951, "English", 704, categories.get(13), authors.get(54))));
		books.add(bookRepo.save(createBook("Eichmann in Jerusalem", 1963, "English", 312, categories.get(13), authors.get(54))));
		books.add(bookRepo.save(createBook("The Demon Haunted World", 1995, "English", 457, categories.get(14), authors.get(50))));
    // Programming & Tech (20 books)
    books.add(bookRepo.save(createBook("Clean Code", 2008, "English", 464, categories.get(16), authors.get(55))));
    books.add(bookRepo.save(createBook("Clean Architecture", 2017, "English", 432, categories.get(16), authors.get(55))));
    books.add(bookRepo.save(createBook("Refactoring", 1999, "English", 448, categories.get(16), authors.get(56))));
    books.add(bookRepo.save(createBook("Patterns Enterprise Apps", 2002, "English", 560, categories.get(16), authors.get(56))));
    books.add(bookRepo.save(createBook("Art of Computer Programming Vol 1", 1968, "English", 672, categories.get(16), authors.get(57))));
    books.add(bookRepo.save(createBook("Art of Computer Programming Vol 2", 1969, "English", 784, categories.get(16), authors.get(57))));
    books.add(bookRepo.save(createBook("The C Programming Language", 1978, "English", 272, categories.get(17), authors.get(58))));
    books.add(bookRepo.save(createBook("Design and Evolution C++", 1994, "English", 461, categories.get(17), authors.get(58))));
    books.add(bookRepo.save(createBook("The Pragmatic Programmer", 1999, "English", 352, categories.get(17), authors.get(59))));
    books.add(bookRepo.save(createBook("Programming Pearls", 1986, "English", 239, categories.get(17), authors.get(60))));
    books.add(bookRepo.save(createBook("Test Driven Development", 2002, "English", 240, categories.get(17), authors.get(61))));
    books.add(bookRepo.save(createBook("Extreme Programming Explained", 1999, "English", 224, categories.get(17), authors.get(61))));
    books.add(bookRepo.save(createBook("Domain Driven Design", 2003, "English", 560, categories.get(16), authors.get(62))));
    books.add(bookRepo.save(createBook("Effective Java", 2001, "English", 416, categories.get(17), authors.get(63))));
    books.add(bookRepo.save(createBook("Java Concurrency in Practice", 2006, "English", 384, categories.get(17), authors.get(63))));
    books.add(bookRepo.save(createBook("Code Complete", 1993, "English", 960, categories.get(16), authors.get(64))));
    books.add(bookRepo.save(createBook("Software Estimation", 2006, "English", 308, categories.get(16), authors.get(64))));
    books.add(bookRepo.save(createBook("Design Patterns", 1994, "English", 395, categories.get(16), authors.get(56))));
    books.add(bookRepo.save(createBook("Introduction to Algorithms", 1990, "English", 1312, categories.get(16), authors.get(57))));
    books.add(bookRepo.save(createBook("Structure and Interpretation", 1985, "English", 657, categories.get(16), authors.get(60))));
    
    // Self-Help & Business (20 books)
    books.add(bookRepo.save(createBook("How to Win Friends", 1936, "English", 291, categories.get(13), authors.get(65))));
    books.add(bookRepo.save(createBook("How to Stop Worrying", 1948, "English", 298, categories.get(13), authors.get(65))));
    books.add(bookRepo.save(createBook("7 Habits Highly Effective People", 1989, "English", 381, categories.get(13), authors.get(66))));
    books.add(bookRepo.save(createBook("The 8th Habit", 2004, "English", 409, categories.get(13), authors.get(66))));
    books.add(bookRepo.save(createBook("Start with Why", 2009, "English", 256, categories.get(13), authors.get(67))));
    books.add(bookRepo.save(createBook("Leaders Eat Last", 2014, "English", 368, categories.get(13), authors.get(67))));
    books.add(bookRepo.save(createBook("Dare to Lead", 2018, "English", 320, categories.get(13), authors.get(68))));
    books.add(bookRepo.save(createBook("Rising Strong", 2015, "English", 336, categories.get(13), authors.get(68))));
    books.add(bookRepo.save(createBook("Atomic Habits", 2018, "English", 320, categories.get(13), authors.get(69))));
    books.add(bookRepo.save(createBook("Deep Work", 2016, "English", 304, categories.get(13), authors.get(69))));
    books.add(bookRepo.save(createBook("Think and Grow Rich", 1937, "English", 238, categories.get(13), authors.get(65))));
    books.add(bookRepo.save(createBook("The Power of Habit", 2012, "English", 371, categories.get(13), authors.get(45))));
    books.add(bookRepo.save(createBook("Mindset", 2006, "English", 320, categories.get(13), authors.get(68))));
    books.add(bookRepo.save(createBook("Grit", 2016, "English", 352, categories.get(13), authors.get(68))));
    books.add(bookRepo.save(createBook("Thinking Fast and Slow", 2011, "English", 499, categories.get(13), authors.get(46))));
    books.add(bookRepo.save(createBook("Influence", 1984, "English", 336, categories.get(13), authors.get(67))));
    books.add(bookRepo.save(createBook("Good to Great", 2001, "English", 300, categories.get(6), authors.get(67))));
    books.add(bookRepo.save(createBook("Built to Last", 1994, "English", 342, categories.get(6), authors.get(67))));
    books.add(bookRepo.save(createBook("The Lean Startup", 2011, "English", 336, categories.get(6), authors.get(67))));
    books.add(bookRepo.save(createBook("Zero to One", 2014, "English", 224, categories.get(6), authors.get(67))));
    
    System.out.println("✅ Created 170 books");
    System.out.println("🎉 Database initialized successfully!");
    System.out.println("📊 Total: 70 authors, 170 books, 20 categories");
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