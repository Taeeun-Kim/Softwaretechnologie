
public class Book implements Comparable<Book> {

	private String isbn;
	private String author = "";
	private String title = "";

	public Book(String isbn, String author, String title) {
		this.isbn = isbn;
		this.author = author;
		this.title = title;
	}

	public Book(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return isbn;
	}

	public String getTitle() {
		return isbn;
	}

	public int compareTo(Book b) {
        if (Integer.parseInt(isbn) < Integer.parseInt(b.getIsbn())) {
            return -1;
        } else if (Integer.parseInt(isbn) > Integer.parseInt(b.getIsbn())) {
            return 1;
        } else {
            return 0;
        }
    }
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", title=" + title + "]";
	}

}
