package com.cg.service;

import java.util.List;

import com.cg.DTO.BookDTO;
import com.cg.entity.Book;
import com.cg.projections.BookProjections;

;

public interface BookService {

	List<Book> getAllBooks();

    Book insertBookIntoDatabase(Book book);

    Book getBookById(int bookId );

    Book updateBook(int bookId, Book book);

    Book deleteBook(int bookId);

     List<BookProjections> getBookWithRequiredAttributes();
}
