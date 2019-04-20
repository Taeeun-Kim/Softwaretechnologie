
public class Human {
	
	public String myForename, myName, fullName;
	
	public Human(String forename, String name) {
		myForename = forename;
		myName = name;
		fullName = forename+" "+name;
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
	
	public String getDriverName() {
		return myForename+" "+myName;
	}

}