package inheritance;

public class HieraricalChildA extends Hieraricalparent{
	public void display1() {
System.out.println("child A");
}

	public static void main(String[] args) {
		HieraricalChildA obj=new HieraricalChildA();
		obj.display();
		obj.display1();
		
		// TODO Auto-generated method stub

	}

}
