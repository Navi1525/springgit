package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.modal.Book;

public interface IBookService {

	List<Book> getAll() throws BookNotFoundException;

	List<Book> getByLesserPrice(double price);

	Book getById(int bookId) throws BookNotFoundException;

	void addBook(Book book);

	String greetMessage();
}
