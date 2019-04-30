
public class Library {
	int count = 0;
	int i = 0;
	Book[] lol = new Book[20];

	Library() {
		System.out.println("Hello, I am a library, which can store up to 10 books!");
	}

	public void add(Book book) {
		if (count >= 10)
			System.out.println("The library is full!");
		else {
			System.out.println("I added the book " + book + "!");
			count += 1;
			lol[count] = book;
		}
	}

	public Object search(String title) {
		while (i <= count) {
			i+=1;
			System.out.println(title);
			System.out.println(lol[i]);
			if(title.equals(lol[i])==true) {
				System.out.println("The book with the title "+lol[i]+" exists in the library!");
				return lol[i];
			}
			else if(i >= count){
				System.out.println("The book with the title "+title+" does not exist in the library!");
				return null;
			}

		}
		return null;
	}

}