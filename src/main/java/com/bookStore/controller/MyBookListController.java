package com.bookStore.controller;

import com.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBookListController {
    @Autowired
    private MyBookListService myBookListService;

    public MyBookListController() {
    }

    @RequestMapping({"/deleteMyList/{id}"})
    public String deleteMyList(@PathVariable("id") long id) {
        this.myBookListService.deleteBook(id);
        return "redirect:/my_books";
    }
}
