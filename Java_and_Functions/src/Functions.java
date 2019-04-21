
public class Functions {
	
	public static int factorial(int n) {
		// insert your implementation here
		if(n==0)
			return 1;
		else if(n<=1)
			return n;
		else
			return factorial(n-1)*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions.factorial(5);

	}

}
