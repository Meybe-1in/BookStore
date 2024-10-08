
package com.bookStore.controller;

import com.bookStore.entity.Book;
import com.bookStore.entity.MyBookList;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    private BookService service;
    @Autowired
    private MyBookListService myBookListService;

    public BookController() {
    }

    @GetMapping({"/"})
    public String home() {
        return "index";
    }

    @GetMapping({"/book_register"})
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping({"/available_books"})
    public ModelAndView getAllBooks() {
        List<Book> list = this.service.getAllBooks();
        return new ModelAndView("bookList", "book", list);
    }

    @GetMapping({"/my_books"})
    public String getMyBooks(Model model) {
        List<MyBookList> list = this.myBookListService.getAllMyBooks();
        model.addAttribute("book", list);
        return "myBooks";
    }

    @PostMapping({"/save"})
    public String addBook(@ModelAttribute Book b) {
        this.service.save(b);
        return "redirect:/available_books";
    }

    @RequestMapping({"/my_book_list/{id}"})
    public String getMyList(@PathVariable("id") long id) {
        Book b = this.service.getBookById(id);
        MyBookList myBookList = new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
        this.myBookListService.saveMyBooks(myBookList);
        return "redirect:/my_books";
    }

    @RequestMapping({"editBook/{id}"})
    public String editBook(@PathVariable("id") long id, Model model) {
        Book b = this.service.getBookById(id);
        model.addAttribute("book", b);
        return "bookEdit";
    }

    @RequestMapping({"deleteBook/{id}"})
    public String deleteBook(@PathVariable("id") long id) {
        this.service.deleteBook(id);
        return "redirect:/available_books";
    }
}

