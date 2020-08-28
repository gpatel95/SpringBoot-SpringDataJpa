package org.dxc.book.service;

import java.util.List;
import java.util.Optional;

import org.dxc.book.model.Book;
import org.dxc.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> getBook(long bid) {
		return bookRepository.findById(bid);
	}

	@Override
	public void deleteBook(long bid) {
		bookRepository.deleteById(bid);

	}

	@Override
	public void updateBook(long bid, Book book) {
		Book book1 = bookRepository.getOne(bid);
		book1.setBookName(book.getBookName());
		book1.setAuthorName(book.getAuthorName());
		book1.setPublisher(book.getPublisher());
		book1.setCategory(book.getCategory());
		book1.setIsbn(book.getIsbn());
		book1.setPrice(book.getPrice());
		bookRepository.save(book1);
	}

	@Override
	public List<Book> findByPublisher(String publisher) {
		return bookRepository.findByPublisher(publisher);
	}

	@Override
	public List<Book> findByCategory(String category) {
		return bookRepository.findByCategory(category);
	}

	

}
