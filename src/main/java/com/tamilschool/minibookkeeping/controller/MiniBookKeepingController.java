package com.tamilschool.minibookkeeping.controller;

import com.tamilschool.minibookkeeping.dto.Book;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MiniBookKeepingController {

    @GetMapping("/fetch")
    public List fetchBookDetails() {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        book1.setBookId(1001);
        book1.setBookName("Java learning");
        book1.setAuthor("Don");
        book1.setBookCost(29.99f);
        book1.setPublisherName("Chennai");

        Book book2 = new Book();
        book2.setBookId(1002);
        book2.setBookName("Pyhton learning");
        book2.setAuthor("Don");
        book2.setBookCost(10.99f);
        book2.setPublisherName("Chennai");

        Book book3 = new Book();
        book3.setBookId(1002);
        book3.setBookName("Pyhton learning");
        book3.setAuthor("Don");
        book3.setBookCost(2.99f);
        book3.setPublisherName("Chennai");


        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        return bookList;
    }

    @PostMapping("/insert")
    public String insertBookDetails() {
        return "Welcome !!";
    }

    @DeleteMapping("/delete")
    public String deleteBookDetail() {
        return "Welcome !!";
    }
}
