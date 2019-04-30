
public class Peasant extends Inhabitant {
	
	public int taxableIncome() {

		return income;
	}

	public int tax() {

		int t = income / 10;
		if (t == 0)
			t = 1;
		System.out.println(t);
		return t;
	}

	public void setIncome(int income) {
		this.income = income;
	}

}
