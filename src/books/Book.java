package books;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private String content;
	private Author author;
	private static List<Book> writtenBooks = new ArrayList<Book>();
	
	public Book(Author author, String title, String content) {		
		this.title = title;
		this.author = author;
		this.content = content;
		writtenBooks.add(this);
	}
	
	// Let's say isbn is the index of the book in writtenBooks
	public static Book getBookByIsbn(int isbn) {
		return writtenBooks.get(isbn);
	}
	
	public int getIsbn() {
		return writtenBooks.indexOf(this);
	}
	
	String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}
	
	
}
