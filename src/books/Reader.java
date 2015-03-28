package books;

public class Reader extends Person {
	public Reader(String name, int dateOfBirth) {
		super(name, dateOfBirth);
	}
	
	public boolean isOver40() {
		if (dateOfBirth <= 1975) return true;
		else return false;
	}
	
	public String readBook(Book b) {
		return b.getContent();
	}
}
