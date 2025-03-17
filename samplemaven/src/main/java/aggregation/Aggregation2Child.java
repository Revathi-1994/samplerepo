package aggregation;

public class Aggregation2Child {
	String city;
	String state;
	AggregationParent1 ref;//reference variable
	
	public Aggregation2Child(String city,String state,AggregationParent1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+ ref.rollno);
		System.out.println(city+ state);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationParent1 obj=new AggregationParent1("Revathi",30,25);
		Aggregation2Child obj1=new Aggregation2Child("Trivandrum","Kerala",obj);
		obj1.display();
		
	}

}
