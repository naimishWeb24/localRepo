package LinkedList;

import java.util.LinkedList;
public class LL1 {

		public static void main(String[] args)
		{
			LinkedList<String> list=new LinkedList<String>();
			
			// Add elements in Linked List
			list.add("Ravi");
			list.add("Yash");
			list.add("Anish");
			list.add("Ravi");
			list.add("Gurav");
			list.add("Harsh");
			list.add("Amit");
			list.add("virat");
			
			//Display Elements in Linked List
			System.out.print(list);
			
			//Add Element in specific index : 
			list.add(2,"rohit");
			System.out.println();
			System.out.println("After add element in Index 2 : "+list);
			
			//Removing Element from List : 
			System.out.println();
			list.remove("Ravi");
			System.out.println("After remove  element in Index 0 : "+list);
			
			//Removing first Element from List : 
			System.out.println();
			list.removeFirst();
			System.out.println("removed first element  : "+list);
			
			//Removing Last element
			System.out.println();
			list.removeLast();
			System.out.println("removed Last element  : "+list);
			
			
			  //Removing all the elements available in the list       
            list.clear(); 
            System.out.println();
            System.out.println("After invoking clear() method: "+list);   
		}
}
