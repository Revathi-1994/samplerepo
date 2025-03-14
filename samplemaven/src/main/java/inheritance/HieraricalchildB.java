package inheritance;

public class HieraricalchildB extends Hieraricalparent {
	public void display2() {
		System.out.println("child B");
	}

	public static void main(String[] args) {
		HieraricalchildB obj=new HieraricalchildB();
		obj.display2();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
