
public class Bottle <T extends Drink> {
	
	private T content;
	private Boolean nervig = true;
	
	public boolean isEmpty() {
		
		return content == null;
	}
	
	public void fill(T content) {
		this.content = content;
		if (nervig == false) {
			throw new IllegalStateException();
		}
		nervig = false;
	}
	
	public T empty() {
		T temp = content;
		content = null;
		if (nervig)
			throw new IllegalStateException();
		nervig = true;
		
		return temp;
	}

}
