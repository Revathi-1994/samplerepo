package interfacepackage;

public class Interface2 implements Interface1{

	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		obj.display();
		obj.show();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("display");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("show");
		// TODO Auto-generated method stub
		
	}

}
