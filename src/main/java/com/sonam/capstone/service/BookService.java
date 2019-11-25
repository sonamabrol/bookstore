package com.sonam.capstone.service;

import com.sonam.capstone.model.Book;

public interface BookService {

    Iterable<Book> listAllBooks();

    Book getBookById(Integer id);

    Book saveBook(Book book);
}
