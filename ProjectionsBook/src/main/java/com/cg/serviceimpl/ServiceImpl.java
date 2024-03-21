package com.cg.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.DTO.BookDTO;
import com.cg.entity.Book;
import com.cg.projections.BookProjections;
import com.cg.repository.BookRepository;
import com.cg.service.BookService;


@Service
public class ServiceImpl implements BookService {
@Autowired
BookRepository bookrepo;
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		  return bookrepo.findAll();
	}

	@Override
	public Book insertBookIntoDatabase(Book book) {
		// TODO Auto-generated method stub
		  return bookrepo.save(book);
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		  return bookrepo.findById(bookId).get();
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookProjections> getBookWithRequiredAttributes() {
		
		return bookrepo.getProductsWithRequiredAttributes();
	}
//		List<BookProjections> bookProjections = bookrepo.getProductsWithRequiredAttributes();
//        List<BookDTO> bookDTOS = new ArrayList<BookDTO>();
//        for (BookProjections projections : bookProjections) {
//
//            bookDTOS.add(new BookDTO(projections.getBookId(),
//                    projections.getBookName(),
//                    projections.getBookPrice(),
//                    projections.getQuantity()));
//
//        }
//        return bookDTOS;
//
//    }


}
