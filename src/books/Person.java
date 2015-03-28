package books;

public abstract class Person {
	private String name;
	protected int dateOfBirth;
	
	protected Person(String name, int dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}
}
