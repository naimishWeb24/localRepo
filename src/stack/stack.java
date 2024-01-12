package stack;
import java.util.Stack;
import java.util.Iterator;
public class stack {

	public static void main(String[] args)
	{
		Stack<Integer> stk=new Stack<>();
		
		
		boolean result=stk.empty();  // check Stack is empty or not
		
		System.out.println("Is the stack empty ? :"+result);
		
		System.out.println();
		// push elements :
		System.out.println("Pushing elements in Stack: ");
		stk.push(11);
		stk.push(29);
		stk.push(31);
		stk.push(49);
		stk.push(51);
		stk.push(69);
		stk.push(71);
		
		System.out.println("Stack Elements: "+stk);
		
		System.out.println();
		
		System.out.println("peek element on Top : ");
	    int  top=stk.peek();
	    System.out.println(top);
	    
	    System.out.println();
	    System.out.println("Search Element 51 in stack : ");
	    int location=stk.search(51);
	    
	    System.out.println( " 51 is found of index : "+location);
	    
	    System.out.println();
	    System.out.println("ckeck size : ");
	    System.out.println("Size of stack is  : "+stk.size());
	    
	    System.out.println();
	    
	    System.out.println("Iterate Elements using iterator(): ");
	    Iterator itr=stk.iterator();
	    
	    while(itr.hasNext())
	    {
	    	Object v=itr.next();
	    	System.out.println(v);
	    }
	    System.out.println();
		
	    System.out.println("Iteration over the stack using forEach() Method:"); 
		stk.forEach(n->{
			
			System.out.println(n);
		});
		
		
		System.out.println();
		
		System.out.println("Pop elements of the top");
		System.out.println(stk);
		System.out.println("pop->71");
		stk.pop();
		System.out.println(stk);
		System.out.println("pop->69");
		stk.pop();
		System.out.println(stk);
		System.out.println("pop->51");
		stk.pop();
		System.out.println(stk);
		System.out.println("pop->49");
		stk.pop();
		System.out.println(stk);
		System.out.println("pop->31");
		stk.pop();
		System.out.println(stk);
		System.out.println("pop->29");
		stk.pop();
		System.out.println(stk);
			
	}
}
