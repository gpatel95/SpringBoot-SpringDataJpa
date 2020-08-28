package org.dxc.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long bid;

	@Column(name = "bookname")
	private String bookName;

	@Column(name = "authorname")
	private String authorName;

	private String publisher;
	private String isbn;
	private String category;
	private double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long bid, String bookName, String authorName, String publisher, String isbn, String category,
			double price) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.isbn = isbn;
		this.category = category;
		this.price = price;
	}

	public long getBid() {
		return bid;
	}

	public void setBid(long bid) {
		this.bid = bid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
