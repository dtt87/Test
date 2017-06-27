package spring.hibernate.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the book_stock database table.
 * 
 */
@Entity
@Table(name = "book_stock")
@NamedQuery(name = "BookStock.findAll", query = "SELECT b FROM BookStock b")
public class BookStock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String isbn;

	private int stock;

	public BookStock() {
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}