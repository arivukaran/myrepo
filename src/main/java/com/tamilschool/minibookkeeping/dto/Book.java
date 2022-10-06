package com.tamilschool.minibookkeeping.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String publisherName;
    private float bookCost;
}
