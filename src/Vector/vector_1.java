package Vector;

import java.util.Vector;

public class vector_1 {

	public static void main(String[] args)
	{
		Vector<String> vec=new Vector<String>();
		
		vec.add("tiger");
		vec.add("Cat");
		vec.add("Lion");
		vec.add("dog");
		
		System.out.println(" Vector Size is : "+vec.size());
		System.out.println(" Default capacity  is : "+vec.capacity());
		
		System.out.println("Elements are  :  "+vec);
		
		vec.remove(0);
		
		System.out.println("after remove first element : "  +vec);
	}
	
}
