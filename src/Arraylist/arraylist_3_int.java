package Arraylist;

import java.util.List;
import java.util.ArrayList;

public class arraylist_3_int {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> pn=new ArrayList<Integer>(); // List 1
		pn.add(2);
		pn.add(3);
		pn.add(5);
		pn.add(7);
		pn.add(11);
		System.out.println("First five Prime numbers  :  "+pn); 
		
		List<Integer> nextprimenumbers=new ArrayList<Integer>(); // List 2
		
		nextprimenumbers.add(13);
		nextprimenumbers.add(17);
		nextprimenumbers.add(19);
		nextprimenumbers.add(23);
		nextprimenumbers.add(29);
		
		pn.addAll(nextprimenumbers); //  merging two Lists
		
		System.out.println("first Ten Prime numbers is : "+pn);
	}
}
