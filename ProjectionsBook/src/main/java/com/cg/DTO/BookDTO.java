package com.cg.DTO;

public class BookDTO {

	 public BookDTO(Integer bookId2, String BookName2, Double BookPrice2, Integer quantity2) {
			// TODO Auto-generated constructor stub
		}

		private int book_Id ;
	    private String Book_Name;

	    private Double Book_Price;

	    private int quantity;

	    
		public BookDTO() {
			super();
		}


		public BookDTO(int bookId, String bookName, Double bookPrice, int quantity) {
			super();
			bookId = bookId;
			Book_Name = bookName;
			Book_Price = bookPrice;
			this.quantity = quantity;
		}


		public int getBookId() {
			return book_Id;
		}


		public int getBook_Id() {
			return book_Id;
		}


		public void setBook_Id(int book_Id) {
			this.book_Id = book_Id;
		}


		public String getBook_Name() {
			return Book_Name;
		}


		public void setBook_Name(String book_Name) {
			Book_Name = book_Name;
		}


		public Double getBook_Price() {
			return Book_Price;
		}


		public void setBook_Price(Double book_Price) {
			Book_Price = book_Price;
		}


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}


		
	
	
}
