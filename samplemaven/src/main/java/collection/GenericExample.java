package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Apple");
		names.add("Orange");
		names.add("banana");
		names.add("Grapes");
		names.add("Mango");
		names.add("Watermelon");
		
		System.out.println(names);
		names.set(3,"Strawberry");
		System.out.println(names);
		System.out.println(names.get(4));
		System.out.println(names);
		
		names.add("Apple");
		System.out.println(names);
		System.out.println(names.indexOf("Apple"));
		System.out.println(names.lastIndexOf("Apple"));
		names.remove(2);
		System.out.println(names);
		System.out.println(names.contains("Banana"));
		
		
		// TODO Auto-generated method stub

	}

}
