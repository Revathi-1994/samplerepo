package interfacepackage;

public class MultipleChild implements MultipleParentA,MultipleParentB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.display1();
	}

	@Override
	public void display1() {
		System.out.println("display1");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("display");
		// TODO Auto-generated method stub
		
	}

}
