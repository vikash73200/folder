package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.DTO.BookDTO;
import com.cg.entity.Book;
import com.cg.projections.BookProjections;
import com.cg.service.BookService;


@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
    private BookService bookservice;
    @GetMapping("/all")
    public List<Book> getAllProductsController() {
        return  bookservice.getAllBooks();
    }
	
    @PostMapping("/insert")
    public Book insertBookInDb(@RequestBody Book book) {
        return  bookservice.insertBookIntoDatabase(book);
    }

    @GetMapping("/find/{id}")
    public Book getBookById(@PathVariable int bookId) {
        return  bookservice.getBookById(bookId);
    }
    
    @GetMapping("/projections")
    public List<BookProjections> getProjections() {
        return bookservice.getBookWithRequiredAttributes();
    }

}
