package com.library.demo.service;

import com.library.demo.model.Author;
import com.library.demo.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    public List<Author> searchAuthors(String keyword) {
        return authorRepository.searchByName(keyword);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}