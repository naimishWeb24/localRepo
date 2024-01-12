package SetMethods;
import java.util.*;
import java.util.HashSet;
public class Hashset {

	
	public static void main(String[] args)
	{
		 HashSet<String> set=new HashSet<>();  // defining HashSet
		
		 // adding elements in HashSet
		 System.out.println("add -> Ravi");
		set.add("Ravi");
		System.out.println(set);             
		System.out.println("add -> ajay");
		set.add("ajay");
		System.out.println(set);
		System.out.println("add -> naimish");
		set.add("naimish");
		System.out.println(set);
		System.out.println("add -> milan");
		set.add("milan");
		System.out.println(set);
		System.out.println("add -> anish");
		set.add("anish");
		
		// Displaying elements
		System.out.println(set);
		
		// iterating HashSet
		System.out.println();
		System.out.println("Iterationg HashSet : ");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// Check for ajay in the set
		System.out.println();
		System.out.println("does the Set Containes 'ajay' ?  : "+set.contains("ajay"));
		
		System.out.println();
		System.out.println("Size of Set is  : "+set.size());
		
		// Removing Spacific element in HashSet
		System.out.println();
		System.out.println("Remove(milan) from HashSet");
		set.remove("milan");
		System.out.println("Updated List : "+set);
		
		// Check size of Hashset : 
		System.out.println();
		System.out.println("Now Size of Set is  : "+set.size());
		
		//Removing all elements from HashSet : 
		System.out.println();
		System.out.println("after Invoking RemoveAll() method : ");
		set.removeAll(set);
		System.out.println(set);
		
		// Invoking clear Method()
		System.out.println();
		System.out.println("Invoking clear() Method ");
		set.clear();
		
		//Checking Hashset isEmpty()
		System.out.println();
		
		boolean check=set.isEmpty();
		System.out.println("if the Set empty ? :"+check);
		
	}
	
}
