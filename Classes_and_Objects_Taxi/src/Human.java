
public class Human {
	
	String myForename, myName;
	
	public Human(String forename, String name) {
		myForename = forename;
		myName = name;
	}

	@Override
	public String toString() {
		
		return myForename+" "+myName;
	}
	
	public String getForename() {
		return myForename;
	}
	
	public String getName() {
		return myName;
	}

}