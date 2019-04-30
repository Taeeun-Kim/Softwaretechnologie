
public class Serf extends Peasant {
	
	public int taxableIncome() {
		if (income>11)
			income=income-12;
		else
			income=0;
		
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
