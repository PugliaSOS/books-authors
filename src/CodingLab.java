import books.Author;
import books.Book;
import books.Reader;

public class CodingLab {

	public static void main(String[] args) {
		Author tolkien = new Author("Tolkien", 1901);
		Author brown = new Author("Dan Brown", 1955);
		Reader tizio = new Reader("Tizio", 1970);
		Reader caio = new Reader("Caio", 1980);
		
		Book lotr = new Book(tolkien, "The Lord of the Rings", "Once upon a time...");
		int daVinciIsbn = new Book(brown, "Da Vinci Code", "This is Da Vinci Code!").getIsbn();
		Book daVinci = Book.getBookByIsbn(daVinciIsbn);
		
		String tizioAge;
		if (tizio.isOver40()) tizioAge = "over 40";
		else tizioAge = "under 40";

		String caioAge;
		if (caio.isOver40()) caioAge = "over 40";
		else caioAge = "under 40";
		
		System.out.println(String.format("%1s (%2s) reads %3s by %4s (age: %5s):", tizio.getName(),
				tizioAge, lotr.getTitle(), lotr.getAuthor().getName(), lotr.getAuthor().getAge()));
		System.out.println(tizio.readBook(lotr));
		
		// Empty space
		System.out.println();
		
		System.out.println(String.format("%1s (%2s) reads %3s by %4s (age: %5s):", caio.getName(),
				caioAge, daVinci.getTitle(), daVinci.getAuthor().getName(), daVinci.getAuthor().getAge()));
		System.out.println(caio.readBook(daVinci));		
	}

}
