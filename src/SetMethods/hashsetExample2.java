package SetMethods;

import java.util.*;
public class hashsetExample2 {

	
	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<>();
		
		set.add("Naimish");
		set.add("Naimish");
		set.add("Naimish");
		set.add("Gaurav");
		set.add("Gaurav");
		
		System.out.println(set);
		
		System.out.println("Set Size is : "+set.size());
	}
}
