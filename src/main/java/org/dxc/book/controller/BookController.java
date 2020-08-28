package org.dxc.book.controller;

import java.util.List;
import java.util.Optional;

import org.dxc.book.model.Book;
import org.dxc.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public HttpStatus insertBook(@RequestBody Book book) {
		boolean status = bookService.saveBook(book) != null;
		return status ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;

	}

	@RequestMapping("/findAll")
	public List<Book> findAllBook() {
		return bookService.getAllBooks();

	}

	@RequestMapping(value = "/findById/{bid}", method = RequestMethod.GET)
	public Optional<Book> findById(@PathVariable long bid) {
		Optional<Book> result = bookService.getBook(bid);
		return result;

	}

	@RequestMapping("/delete/{bid}")
	public void deleteBook(@PathVariable long bid) {
		bookService.deleteBook(bid);
	}

	@RequestMapping("/update/{bid}")
	public void updateBook(@RequestBody Book book, @PathVariable("bid") long bid) {
		bookService.updateBook(bid, book);
	}

	@RequestMapping("/findByPublisher/{publisher}")
	public List<Book> findByPublisher(@PathVariable("publisher") String publisher) {
		return bookService.findByPublisher(publisher);

	}

	@RequestMapping("/findByCategory/{category}")
	public List<Book> findByCategory(@PathVariable("category") String category) {
		return bookService.findByCategory(category);
	}
	
	
}
