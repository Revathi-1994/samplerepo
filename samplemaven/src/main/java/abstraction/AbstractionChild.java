package abstraction;

public class AbstractionChild extends AbstractionParent{
	public void show()
	{
		System.out.println("show");
	}

	public static void main(String[] args) {
		/*AbstractionChild obj=new AbstractionChild();
		obj.display();
		obj.display2();
		obj.show();*/
		AbstractionParent obj=new AbstractionChild();//reference creation
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
