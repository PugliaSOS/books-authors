package books;

public class Author extends Person {
	public Author(String name, int dateOfBirth) {
		super(name, dateOfBirth);
	}
	
	public int getAge() {
		return 2015 - dateOfBirth;
	}
}
