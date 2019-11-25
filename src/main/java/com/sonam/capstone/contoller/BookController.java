package com.sonam.capstone.contoller;

import com.sonam.capstone.model.Book;
import com.sonam.capstone.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {


     private BookService bookService;

    @Autowired
    public void setProductService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("books", bookService.listAllBooks());
        System.out.println("Returning books:");
        return "Books";
    }

    @RequestMapping("/books/new")
    public String newBook(Model model){
        model.addAttribute("book", new Book());
        return "bookform";
    }

    @RequestMapping(value = "book", method = RequestMethod.POST)
    public String saveBook(Book book){

        bookService.saveBook(book);

        return "redirect:/book/" + book.getId();
    }

    @RequestMapping("book/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("book", bookService.getBookById(id));
        return "bookshow";
    }
}
