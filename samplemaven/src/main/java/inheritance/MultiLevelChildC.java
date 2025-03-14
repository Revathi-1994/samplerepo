package inheritance;

public class MultiLevelChildC extends MultiLevelParentB {

	public void sample2()
	{
		System.out.println("Child C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChildC obj=new MultiLevelChildC();
		obj.sample();
		obj.sample1();
		obj.sample2();
		
	}

}
