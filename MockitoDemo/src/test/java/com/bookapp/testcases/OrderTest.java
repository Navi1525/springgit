package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.modal.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class OrderTest {
	@Mock
	IBookService bookService;
	@InjectMocks
	OrderDetails details;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}
	Book book1; 
	Book book2; 
	Book book3; 
	Book book4;
	Book book5; 
	Book book6;
	Book book7;
	List<Book> bookList =null;

	@BeforeEach
	void setUp() throws Exception {
		book1 = new Book(1,"Java","Kathy",850);
		book2 = new Book(2,"JScript","Kathy",850);
		book3 = new Book(3,"The 5  am","robin",850);
		book4= new Book(4,"JSP","Kathy",850);
		book5 = new Book(5,"Leadership","robin",850);
		book6 = new Book(6,"monk","robin",850);
		book7 = new Book(7,"secret","rhonde",850);
		bookList =Arrays.asList(book1,book2,book3,book4,book5,book6,book7);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test@DisplayName("testing book return one instance of book")
//	void testBookById() throws BookNotFoundException {
//		doReturn(book1).when(bookService).getById(1);
//		String actual =details.orderBook(1);
//		assertEquals("Book Ordered",actual);
//	}
	
	@Test@DisplayName("testing book return null")
	void testBookByIdNull() throws BookNotFoundException {
		doReturn(null).when(bookService).getById(10);
		String actual =details.orderBook(10);
		assertEquals("Out of Stock",actual);
	}
	
	@Test@DisplayName("testing book throws Exception")
	void testBookByIdException() throws BookNotFoundException {
		doThrow(new BookNotFoundException ("Invalid Id")).when(bookService).getById(20);
		String actual =details.orderBook(20);
		assertEquals("Technical Glitch",actual);
	}
	@Test@DisplayName("Testing add Book")
	void testAddWork() throws BookNotFoundException {
		doNothing().when(bookService).addBook(book1);
		String actual = details.addBook(book1);
		assertEquals("book added",actual);
	}
	@Test@DisplayName("Testing add Book-null")
	void testAddBookNull() throws BookNotFoundException {
		String actual = details.addBook(book1);
		assertEquals("book not added",actual);
	}
	@Test@DisplayName("testing Book -return one")
	void testBookById() throws BookNotFoundException{
		doReturn (book1).when(bookService).getById(10);
		String actual = details.addBook(book1);
		assertEquals("book found",actual);
	}

}
