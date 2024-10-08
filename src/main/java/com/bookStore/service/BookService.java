package com.bookStore.service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public BookService() {
    }

    public void save(Book b) {

        this.bookRepository.save(b);
    }

    public List<Book> getAllBooks() {

        return this.bookRepository.findAll();
    }

    public Book getBookById(long id) {

        return this.bookRepository.findById(id).orElse((Book) null);
    }

    public void deleteBook(long id) {

        this.bookRepository.deleteById(id);
    }
}

