package SetMethods;
import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args)
	{
		LinkedHashSet<String> str=new LinkedHashSet<>();
		
		// check isEmpty()
		boolean check=str.isEmpty();
		System.out.println("does LHS is empty ? = "+check);
		
		
		// Add elements 
		System.out.println();
		System.out.println("Adding Elements : ");
		str.add("India");		
		str.add("China");
		str.add("USA");
		str.add("Russia");
		str.add("Pakistan");
		
		System.out.println();
		System.out.println("LinkedListHashSet : "+str);
		System.out.println();
		
		// removing element :  
		System.out.println("Removing Element -> Pakistan \n");
		str.remove("Pakistan");
		System.out.println();
		System.out.println("After Removing element :  "+ str);
		System.out.println();
		
		
		
	}
	
	
	
}
