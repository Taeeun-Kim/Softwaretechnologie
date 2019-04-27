
public class Book {
	public String title;
	
	Book(String title){
		this.setTitle(title);
		System.out.println("Book "+title+" created.");
	}

	@Override
	public String toString() {
		return title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
