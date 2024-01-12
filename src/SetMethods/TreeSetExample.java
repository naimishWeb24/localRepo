package SetMethods;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args)
	{
		TreeSet<String> set=new TreeSet<>();  //Defining treeSet
		
		System.out.println();
		
		//Adding elements in TreeSet :
		
		System.out.println("Adding Elements in TreeSet : ");
		set.add("Surat");
		set.add("Ahmedabad");
		set.add("Rajkot");
		set.add("Amreli");
		set.add("Gandhinagar");
		set.add("Porbandar");
		
		//displaying element in TreeSet
		System.out.println();
		System.out.println("TreeSet : "+set);
		
		//Removing element in TreeSet
		System.out.println();
		System.out.println("Removing Element Rajkot ");
		set.remove("Rajkot");
		System.out.println();
		System.out.println("After Remove Element :");
		System.out.println(set);
		
		//Traversing Through Descending Order 
		System.out.println();
		System.out.println("Traversing elements descending Order : ");
		Iterator i=set.descendingIterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+ " , ");
		}
		
		
	}
}
