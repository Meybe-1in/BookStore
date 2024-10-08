package com.bookStore.service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBookListService {
    @Autowired
    private MyBookRepository myBookRepository;

    public MyBookListService() {
    }

    public void saveMyBooks(MyBookList book) {
        this.myBookRepository.save(book);
    }

    public List<MyBookList> getAllMyBooks() {
        return this.myBookRepository.findAll();
    }

    public void deleteBook(long id) {
        this.myBookRepository.deleteById(id);
    }
}
