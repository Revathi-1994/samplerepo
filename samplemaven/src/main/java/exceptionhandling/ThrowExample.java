package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int n= 12;
		if(n>18)
		{
			System.out.println("Eligible for voting");
		}
		// TODO Auto-generated method stub
		else
		{
			throw new ArithmeticException("Age under 18");
		}
	}

}
