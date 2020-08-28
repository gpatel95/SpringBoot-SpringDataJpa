package org.dxc.book.service;

import java.util.List;
import java.util.Optional;

import org.dxc.book.model.Book;

public interface BookService {

	public Book saveBook(Book book);

	public List<Book> getAllBooks();

	public Optional<Book> getBook(long bid);

	public void deleteBook(long bid);

	public void updateBook(long bid, Book book);

	public List<Book>findByPublisher(String publisher);
	
	public List<Book>findByCategory(String category);

	
}
