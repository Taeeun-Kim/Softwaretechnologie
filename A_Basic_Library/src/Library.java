
public class Library {
	int count = 0;
	int i = 0;
	String[] array = new String[20];

	Library() {
		System.out.println("Hello, I am a library, which can store up to 10 books!");
	}

	public void add(Book book) {
		if (count >= 10)
			System.out.println("The library is full!");
		else {
			System.out.println("I added the book " + book.title + "!");
			count += 1;
			array[count] = book.title;
		}
	}

	public Object search(String title) {
		while (i <= count) {
			i+=1;
			if(title.equals(array[i])) {
				System.out.println("The book with the title "+title+" exists in the library!");
				return title;
			}
			else if(i >= count){
				System.out.println("The book with the title "+title+" does not exist in the library!");
				return null;
			}

		}
		return title;
	}

}
