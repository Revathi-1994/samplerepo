package abstraction;

public class AbstractionChild extends AbstractionParent{

	public static void main(String[] args) {
		AbstractionChild obj=new AbstractionChild();
		obj.display();
		obj.display2();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstraction");
		
	}

}
