package Arraylist;

import java.util.List;
import java.util.ArrayList;
public class arraylist2 {
	
	public static void main(String[] args)
	{
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("dog");
		
		System.out.println(animals);
		
		animals.add(2,"Elephant");
		System.out.println(animals);
	}
}