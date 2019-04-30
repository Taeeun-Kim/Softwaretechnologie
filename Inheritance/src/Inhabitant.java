
public class Inhabitant {

	int income;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Inhabitant a = new Inhabitant();
		a.setIncome(-1);
		a.tax();
		*/
		
		/*
		Inhabitant k = new King();

        k.setIncome(100);
        k.tax();
        */
		
		/*
		Inhabitant n = new Noble();
        n.setIncome(305);
        n.tax();
        */
		
		Peasant serf = new Serf();
        serf.setIncome(13);
        serf.taxableIncome();
        serf.setIncome(20);
        serf.taxableIncome();
        

		
	}

}
