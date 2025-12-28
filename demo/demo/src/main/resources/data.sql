-- ============================================
-- CATEGORIES (20 categories)
-- ============================================

-- Root categories
INSERT INTO categories (category_name, parent_category_id) VALUES ('Fiction', NULL);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Non-Fiction', NULL);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Science', NULL);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Technology', NULL);
INSERT INTO categories (category_name, parent_category_id) VALUES ('History', NULL);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Arts', NULL);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Business', NULL);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Health', NULL);

-- Subcategories
INSERT INTO categories (category_name, parent_category_id) VALUES ('Science Fiction', 1);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Fantasy', 1);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Mystery', 1);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Romance', 1);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Biography', 2);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Self-Help', 2);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Physics', 3);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Biology', 3);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Computer Science', 4);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Programming', 4);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Web Development', 4);
INSERT INTO categories (category_name, parent_category_id) VALUES ('Ancient History', 5);

-- ============================================
-- AUTHORS (70 authors)
-- ============================================

INSERT INTO authors (name, age, nationality) VALUES ('George Orwell', 46, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Jane Austen', 41, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Mark Twain', 74, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Charles Dickens', 58, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Leo Tolstoy', 82, 'Russian');
INSERT INTO authors (name, age, nationality) VALUES ('Fyodor Dostoevsky', 59, 'Russian');
INSERT INTO authors (name, age, nationality) VALUES ('Ernest Hemingway', 61, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Virginia Woolf', 59, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('James Joyce', 58, 'Irish');
INSERT INTO authors (name, age, nationality) VALUES ('Franz Kafka', 40, 'Czech');
INSERT INTO authors (name, age, nationality) VALUES ('Gabriel García Márquez', 87, 'Colombian');
INSERT INTO authors (name, age, nationality) VALUES ('Haruki Murakami', 75, 'Japanese');
INSERT INTO authors (name, age, nationality) VALUES ('Chimamanda Ngozi Adichie', 47, 'Nigerian');
INSERT INTO authors (name, age, nationality) VALUES ('Salman Rushdie', 77, 'British-Indian');
INSERT INTO authors (name, age, nationality) VALUES ('Margaret Atwood', 85, 'Canadian');
INSERT INTO authors (name, age, nationality) VALUES ('Toni Morrison', 88, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('J.K. Rowling', 59, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Stephen King', 77, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Neil Gaiman', 64, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Paulo Coelho', 77, 'Brazilian');
INSERT INTO authors (name, age, nationality) VALUES ('Isaac Asimov', 72, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Arthur C. Clarke', 90, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Ursula K. Le Guin', 88, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Philip K. Dick', 53, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Ray Bradbury', 91, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Frank Herbert', 65, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Octavia Butler', 58, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Douglas Adams', 49, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Terry Pratchett', 66, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Brandon Sanderson', 49, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Agatha Christie', 85, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Arthur Conan Doyle', 71, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Dan Brown', 60, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Gillian Flynn', 53, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Lee Child', 69, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Malcolm Gladwell', 61, 'Canadian');
INSERT INTO authors (name, age, nationality) VALUES ('Yuval Noah Harari', 48, 'Israeli');
INSERT INTO authors (name, age, nationality) VALUES ('Michelle Obama', 60, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Walter Isaacson', 72, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Stephen Hawking', 76, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Robert C. Martin', 71, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Martin Fowler', 61, 'British');
INSERT INTO authors (name, age, nationality) VALUES ('Donald Knuth', 86, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Bjarne Stroustrup', 74, 'Danish');
INSERT INTO authors (name, age, nationality) VALUES ('Andrew Hunt', 60, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Dale Carnegie', 66, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Stephen Covey', 79, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Simon Sinek', 51, 'British-American');
INSERT INTO authors (name, age, nationality) VALUES ('Brené Brown', 59, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('James Clear', 37, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Khaled Hosseini', 59, 'Afghan-American');
INSERT INTO authors (name, age, nationality) VALUES ('Yann Martel', 61, 'Canadian');
INSERT INTO authors (name, age, nationality) VALUES ('Arundhati Roy', 63, 'Indian');
INSERT INTO authors (name, age, nationality) VALUES ('Kazuo Ishiguro', 70, 'British-Japanese');
INSERT INTO authors (name, age, nationality) VALUES ('Jhumpa Lahiri', 57, 'British-American');
INSERT INTO authors (name, age, nationality) VALUES ('Maya Angelou', 86, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Pablo Neruda', 69, 'Chilean');
INSERT INTO authors (name, age, nationality) VALUES ('Langston Hughes', 65, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Oscar Wilde', 46, 'Irish');
INSERT INTO authors (name, age, nationality) VALUES ('Tennessee Williams', 71, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Howard Zinn', 87, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Jared Diamond', 87, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Hannah Arendt', 69, 'German-American');
INSERT INTO authors (name, age, nationality) VALUES ('Noam Chomsky', 96, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Carl Sagan', 62, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Nicholas Sparks', 59, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Nora Roberts', 74, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('John Green', 47, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Suzanne Collins', 62, 'American');
INSERT INTO authors (name, age, nationality) VALUES ('Veronica Roth', 36, 'American');

-- ============================================
-- BOOKS (170 books)
-- ============================================

-- Classic Fiction (Category 1)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('1984', 1949, 'English', 328, 1, 1);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Animal Farm', 1945, 'English', 112, 1, 1);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Pride and Prejudice', 1813, 'English', 432, 1, 2);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Adventures of Huckleberry Finn', 1884, 'English', 366, 1, 3);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Great Expectations', 1861, 'English', 505, 1, 4);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('War and Peace', 1869, 'Russian', 1225, 1, 5);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Crime and Punishment', 1866, 'Russian', 671, 1, 6);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Old Man and the Sea', 1952, 'English', 127, 1, 7);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Mrs Dalloway', 1925, 'English', 194, 1, 8);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Ulysses', 1922, 'English', 730, 1, 9);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Metamorphosis', 1915, 'German', 201, 1, 10);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('One Hundred Years of Solitude', 1967, 'Spanish', 417, 1, 11);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Norwegian Wood', 1987, 'Japanese', 296, 1, 12);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Half of a Yellow Sun', 2006, 'English', 433, 1, 13);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Midnights Children', 1981, 'English', 647, 1, 14);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Handmaids Tale', 1985, 'English', 311, 1, 15);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Beloved', 1987, 'English', 324, 1, 16);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Kite Runner', 2003, 'English', 371, 1, 51);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Life of Pi', 2001, 'English', 319, 1, 52);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The God of Small Things', 1997, 'English', 340, 1, 53);

-- Science Fiction (Category 9)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Foundation', 1951, 'English', 255, 9, 21);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('I Robot', 1950, 'English', 224, 9, 21);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Foundation and Empire', 1952, 'English', 247, 9, 21);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Second Foundation', 1953, 'English', 210, 9, 21);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Foundation and Earth', 1986, 'English', 528, 9, 21);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('2001 A Space Odyssey', 1968, 'English', 297, 9, 22);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Left Hand of Darkness', 1969, 'English', 304, 9, 23);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Do Androids Dream of Electric Sheep', 1968, 'English', 210, 9, 24);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Fahrenheit 451', 1953, 'English', 158, 9, 25);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Dune', 1965, 'English', 688, 9, 26);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Kindred', 1979, 'English', 287, 9, 27);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Hitchhikers Guide to the Galaxy', 1979, 'English', 224, 9, 28);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Hunger Games', 2008, 'English', 374, 9, 69);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Divergent', 2011, 'English', 487, 9, 70);

-- Fantasy (Category 10)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Harry Potter and the Philosophers Stone', 1997, 'English', 223, 10, 17);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Harry Potter and the Chamber of Secrets', 1998, 'English', 251, 10, 17);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Harry Potter and the Prisoner of Azkaban', 1999, 'English', 317, 10, 17);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Harry Potter and the Goblet of Fire', 2000, 'English', 636, 10, 17);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Harry Potter and the Order of the Phoenix', 2003, 'English', 766, 10, 17);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Harry Potter and the Half-Blood Prince', 2005, 'English', 607, 10, 17);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Harry Potter and the Deathly Hallows', 2007, 'English', 607, 10, 17);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('American Gods', 2001, 'English', 635, 10, 19);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Good Omens', 1990, 'English', 288, 10, 29);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Color of Magic', 1983, 'English', 206, 10, 29);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Way of Kings', 2010, 'English', 1007, 10, 30);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Fault in Our Stars', 2012, 'English', 313, 10, 68);

-- Mystery (Category 11)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Shining', 1977, 'English', 447, 11, 18);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('It', 1986, 'English', 1138, 11, 18);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Carrie', 1974, 'English', 199, 11, 18);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Stand', 1978, 'English', 823, 11, 18);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Misery', 1987, 'English', 320, 11, 18);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Pet Sematary', 1983, 'English', 374, 11, 18);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Green Mile', 1996, 'English', 592, 11, 18);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Murder on the Orient Express', 1934, 'English', 256, 11, 31);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('And Then There Were None', 1939, 'English', 272, 11, 31);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Hound of the Baskervilles', 1902, 'English', 256, 11, 32);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Da Vinci Code', 2003, 'English', 454, 11, 33);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Gone Girl', 2012, 'English', 419, 11, 34);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Killing Floor', 1997, 'English', 542, 11, 35);

-- Romance (Category 12)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Alchemist', 1988, 'Portuguese', 163, 12, 20);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Notebook', 1996, 'English', 214, 12, 66);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('A Walk to Remember', 1999, 'English', 240, 12, 66);

-- Biography (Category 13)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Becoming', 2018, 'English', 448, 13, 38);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Steve Jobs', 2011, 'English', 656, 13, 39);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('A Brief History of Time', 1988, 'English', 256, 13, 40);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('I Know Why the Caged Bird Sings', 1969, 'English', 289, 13, 56);

-- Self-Help (Category 14)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Tipping Point', 2000, 'English', 301, 14, 36);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Outliers', 2008, 'English', 309, 14, 36);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Sapiens', 2011, 'English', 443, 14, 37);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Homo Deus', 2015, 'English', 440, 14, 37);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('How to Win Friends and Influence People', 1936, 'English', 291, 14, 46);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The 7 Habits of Highly Effective People', 1989, 'English', 381, 14, 47);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Start with Why', 2009, 'English', 256, 14, 48);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Dare to Lead', 2018, 'English', 320, 14, 49);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Atomic Habits', 2018, 'English', 320, 14, 50);

-- Physics (Category 15)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Cosmos', 1980, 'English', 365, 15, 65);

-- Biology (Category 16)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Selfish Gene', 1976, 'English', 360, 16, 37);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Guns Germs and Steel', 1997, 'English', 480, 16, 62);

-- Computer Science (Category 17)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Clean Code', 2008, 'English', 464, 17, 41);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Refactoring', 1999, 'English', 448, 17, 42);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Art of Computer Programming Vol 1', 1968, 'English', 672, 17, 43);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Design Patterns', 1994, 'English', 395, 17, 42);

-- Programming (Category 18)
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Pragmatic Programmer', 1999, 'English', 352, 18, 45);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The C Programming Language', 1978, 'English', 272, 18, 44);

-- Add more books to reach 170
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Never Let Me Go', 2005, 'English', 288, 1, 54);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Picture of Dorian Gray', 1890, 'English', 254, 1, 59);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('A Streetcar Named Desire', 1947, 'English', 107, 1, 60);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('1984 French Edition', 1950, 'French', 328, 1, 1);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Pride and Prejudice Spanish Edition', 1820, 'Spanish', 432, 1, 2);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Tom Sawyer', 1876, 'English', 274, 1, 3);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Oliver Twist', 1838, 'English', 608, 1, 4);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Anna Karenina', 1877, 'Russian', 864, 1, 5);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Brothers Karamazov', 1880, 'Russian', 796, 1, 6);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('For Whom the Bell Tolls', 1940, 'English', 471, 1, 7);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('To the Lighthouse', 1927, 'English', 209, 1, 8);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('A Portrait of the Artist as a Young Man', 1916, 'English', 253, 1, 9);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Trial', 1925, 'German', 255, 1, 10);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Love in the Time of Cholera', 1985, 'Spanish', 348, 1, 11);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Kafka on the Shore', 2002, 'Japanese', 480, 1, 12);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Americanah', 2013, 'English', 477, 1, 13);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Moors Last Sigh', 1995, 'English', 434, 1, 14);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Oryx and Crake', 2003, 'English', 376, 1, 15);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Song of Solomon', 1977, 'English', 337, 1, 16);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Casual Vacancy', 2012, 'English', 503, 1, 17);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Under the Dome', 2009, 'English', 1074, 11, 18);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Coraline', 2002, 'English', 162, 10, 19);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Zahir', 2005, 'Portuguese', 336, 12, 20);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Robots of Dawn', 1983, 'English', 435, 9, 21);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('Rendezvous with Rama', 1973, 'English', 256, 9, 22);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Dispossessed', 1974, 'English', 387, 9, 23);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES ('The Man in the High Castle', 1962, 'English', 239, 9, 24);
INSERT INTO books (title, publication_year, language, nb_pages, category_id, author_id) VALUES