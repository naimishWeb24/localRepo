package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
	
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Rakesh");
		list.add("Mehul");
		list.add("Anish");
		list.add("vijay");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
