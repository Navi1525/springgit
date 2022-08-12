package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.modal.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class OrderDetailsTestcases {

	
	@Mock
	IBookService bookService;
	
	@InjectMocks
	OrderDetails details;
	Book book1; 
	Book book2; 
	Book book3; 
	Book book4;
	Book book5; 
	Book book6;
	Book book7;
	List<Book> bookList =null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

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

	@Test
	void testSetBookService() {
	}

	@Test
	void testFindByAuthour() {
	}

	@Test
	void testOrderBook() {
	}

	@Test
	void testAddBook() {
	}
	@Test
	void testShowMessage() {
		Mockito.when(bookService.greetMessage()).thenReturn("Great Day");
		String actual =details.showMessage("Priya");
		assertEquals("Great Day Priya",actual);
		String nactual =details.showMessage("Praachi");
		assertEquals("Great Day Praachi",nactual);
	}

	@Test
	void testAnShowMessage() {
		Mockito.when(bookService.greetMessage()).thenReturn("Wrong User");
		String actual =details.showMessage("Raj");
		assertEquals("Wrong User",actual);
		String nactual =details.showMessage("Helen");
		assertEquals("Wrong User",nactual);
	}@Test
	void testGetByAuthor() throws BookNotFoundException{
		String author = "Robin";
		when(bookService.getAll()).thenReturn(bookList);
		List<Book> actualBooks=details.findByAuthour(author);
		List<Book> expectedBooks=Arrays.asList(book3,book5,book6);
		assertEquals(expectedBooks,actualBooks);
		
	}@Test @DisplayName("Testing by authors - throw exception")
	void testGetByAuthorException() throws BookNotFoundException{
		String author ="priya";
		when (bookService.getAll()).thenThrow (new BookNotFoundException());
		assertThrows(BookNotFoundException.class,()->{
		details.findByAuthour(author);});
	}
	@Test @DisplayName("Testing by authors - empty list")
	void testGetByAuthorEmpty() throws BookNotFoundException{
		String author ="priya";
		List<Book>emptyList =new ArrayList<>();
		assertThrows(BookNotFoundException.class,()->{
		details.findByAuthour(author);});
	}
	@Test @DisplayName("Testing by authors -null")
	
	void testGetByAuthorNull() throws BookNotFoundException{
		String author ="priya";
		when(bookService.getAll()).thenReturn(null);
		List<Book> actualBooks = details.findByAuthour(author);
		assertNull(actualBooks);
	}

}
