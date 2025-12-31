package com.library.demo.dto;

import com.library.demo.model.Book;
import org.springframework.data.domain.Page;

import java.util.List;

public class PageInfo {
    private List<Book> content;
    private int totalElements;
    private int totalPages;
    private int currentPage;
    private int pageSize;
    private boolean hasNext;
    private boolean hasPrevious;

    public PageInfo(List<Book> content, int totalElements, int totalPages, 
                    int currentPage, int pageSize, boolean hasNext, boolean hasPrevious) {
        this.content = content;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.hasNext = hasNext;
        this.hasPrevious = hasPrevious;
    }

    public static PageInfo from(Page<Book> page) {
        return new PageInfo(
            page.getContent(),
            (int) page.getTotalElements(),
            page.getTotalPages(),
            page.getNumber(),
            page.getSize(),
            page.hasNext(),
            page.hasPrevious()
        );
    }
    
    // Getters
    public List<Book> getContent() { return content; }
    public int getTotalElements() { return totalElements; }
    public int getTotalPages() { return totalPages; }
    public int getCurrentPage() { return currentPage; }
    public int getPageSize() { return pageSize; }
    public boolean isHasNext() { return hasNext; }
    public boolean isHasPrevious() { return hasPrevious; }
}