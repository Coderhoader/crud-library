package com.LibraryDuplicate.lib.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="storage2")
public class LibDup {
	@Column(name="book_name")
	private String book_name;
	@Id
	@Column(name="id")
	private String id;
	@Column(name="isbn")
	private String isbn;
	@Column(name="aisle")
	private int aisle;
	@Column(name="author")
	private String author;
	
	
	
	
// constuctors

	public LibDup() {
		super();
		
	}

	
	
	
	public LibDup(String book_name, String id, String isbn, int aisle, String author) {
		super();
		this.book_name = book_name;
		this.id = id;
		this.isbn = isbn;
		this.aisle = aisle;
		this.author = author;
	}





	// getters and setters
	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAisle() {
		return aisle;
	}

	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
