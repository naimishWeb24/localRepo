package Vector;

import java.util.Vector;
public class VectorCopyIntoExample {
	
	
	public static void main(String[] args)
	{
		Vector<Integer> vec=new Vector<>(5);
		
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		vec.add(5);
		
		Integer[] a=new Integer[5];
		
		vec.copyInto(a);
		
		System.out.println("element of Array is : ");
		
		for(int i=1;i<=a.length;i++)
		{
			System.out.print(i+"   ");
		}
		
	}

}
