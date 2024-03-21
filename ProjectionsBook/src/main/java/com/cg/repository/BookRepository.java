package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.entity.Book;
import com.cg.projections.BookProjections;


public interface BookRepository extends JpaRepository<Book, Integer>{
	@Query(value = "select book_Id,Book_Name,Book_Price,quantity from book_table", nativeQuery = true)
    List<BookProjections> getProductsWithRequiredAttributes();
}
