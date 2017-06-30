package spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import spring.jpa.entities.Book;
@RepositoryDefinition(domainClass = Book.class, idClass = Book.class)
public interface BookRepository extends JpaRepository<Book, String> {	
	@Query(value = "select price from Book where isbn = :isbn", nativeQuery = true)
	public int findByIsbn(@Param(value = "isbn") String isbn);
}
