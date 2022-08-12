package com.bookapp.service;


import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.modal.Book;

public class OrderDetails {
	IBookService bookService;

	public void SetBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	public String showMessage(String name) {
		String result = bookService.greetMessage();
		if(name.startsWith("P"))
			return result.concat(" ").concat(name);
		else
			return "Wrong User";
	}
	
	

	public List<Book> findByAuthour(String author) throws BookNotFoundException {
		List<Book> books = bookService.getAll();
		if(books== null)
			return null;
		if (books.isEmpty())
			throw new BookNotFoundException();
		return books.stream()
				.filter(book ->book.getAuthor().equals(author))
				.collect(Collectors.toList());
	}

	public String orderBook(int bookId)  throws BookNotFoundException{
	 try {
		 Book book =bookService.getById(bookId);
		 if (book == null) 
			 return "Out of Stock";
		 return "Book Ordered";
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 return "Technical Issues";
	}

	public String addBook(Book book) {
		if (book ==null)
			return "book not added";
		bookService.addBook(book);
		return "Book Added";
	}
	

}
