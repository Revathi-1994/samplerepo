package superkey;

public class SuperMethodChild extends SuperMethod {
	public void display2()
	{
		super.display();
		System.out.println("World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj=new SuperMethodChild();
		obj.display2();
	}

}
