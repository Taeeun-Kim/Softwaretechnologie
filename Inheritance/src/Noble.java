
public class Noble extends Inhabitant {
	
	public int tax() {

		int t = income / 10;
		if (t < 20)
			t = 20;
		System.out.println(t);
		return t;
	}

}
