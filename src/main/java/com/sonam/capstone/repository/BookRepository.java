package com.sonam.capstone.repository;

import com.sonam.capstone.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book, Integer> {
}
