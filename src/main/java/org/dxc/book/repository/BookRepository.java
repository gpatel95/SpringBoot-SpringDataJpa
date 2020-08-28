package org.dxc.book.repository;

import java.util.List;

import org.dxc.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface BookRepository extends JpaRepository<Book, Long> {

	@Query("SELECT b from Book b where b.publisher=:publisher")
	List<Book>findByPublisher(@Param("publisher") String publisher);

	@Query("SELECT b from Book b where b.category=:category")
	List<Book>findByCategory(String category);
	
	
}
