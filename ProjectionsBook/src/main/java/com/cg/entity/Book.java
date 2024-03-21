package com.cg.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "BookTable")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book{

    @Id
	private int book_Id ;
    private String Book_Name;

    private Double Book_Price;

    private int quantity;

    private String description;

   private Integer rating;
   

    }