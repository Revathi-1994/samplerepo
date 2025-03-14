package superkey;

public class SuperConstructorChild extends SuperConstructor {
	public SuperConstructorChild() {
		super(5,6);
		System.out.println("Default Constructor");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj=new SuperConstructorChild();
		
	}

}
