
public class MyTaxiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human aHuman = new Human("Maximilian", "Huber");
		System.out.println("This is " + aHuman + ".");
		System.out.println(aHuman.getName());
		System.out.println(aHuman.getDriverName());
		
		Human m2 = new Human("Franzi","Ada");
		Taxi aTaxi = new Taxi("Franzi","Ada");
		
		System.out.println(aTaxi.add());
	}

}
