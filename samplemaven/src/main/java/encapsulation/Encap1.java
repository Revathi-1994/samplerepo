package encapsulation;

public class Encap1 {
	private String name;
	private int age;
	public void setDetails(String name,int age)
	{
	this.name=name;
	this.age=age;
	}
	public void getDetails()
	{
		System.out.println(name+" "+age);
	}
}
