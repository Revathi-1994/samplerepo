package polymorphism;

public class Child extends Parent{
public void sum(int a,int b)
{
	super.sum(8,9);
	int c=a+b;
	System.out.println("Child sum is"+c);//override
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj=new Child();
obj.sum(5,10);
	}

}
