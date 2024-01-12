package Arraylist;

import java.util.*;
public class Employee  {
	
	private static ArrayList <Crud> list=new ArrayList<>();
	
	public static void addEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id  : ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter employee Name : ");
		String name=sc.nextLine();
		System.out.println("enter employee Salary  : ");
		double salary=sc.nextDouble();
		
		Crud c=new Crud(id,name,salary);
		list.add(c);
		
	}
	
	public static  void display()
	{
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else {
			System.out.println("Id     name         Salary");
			 for (int i=0;i<list.size();i++)
			 {
				 Crud c=list.get(i);
				 System.out.println(c.getid()+"    "+c.getname()+ "      "+c.getsalary());
			 }
			
		}
	}
	
	public static void delete()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Employee Id you Want to Delete : ");
		int id=sc.nextInt();
		sc.nextLine();
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
			
		}else
		{
			for (int i=0;i<list.size();i++)
			{
				Crud c=list.get(i);
				if(c.getid() == id)
				{
					list.remove(i);
					System.out.println("Employee Deletyed SuccessFully");
					return;
				}
				else {
					System.out.println("Employee Not found");
				}
				
			}
		}
	}
	
	public static void updateEmp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Employee Id you Want to Update : ");
		int uid=sc.nextInt();
		
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
			
		}else
		{
			for(int i=0;i<list.size();i++)
			{
				
				
				Crud c=list.get(i);
				if(c.getid() == uid)
				{
					sc.nextLine();
					System.out.println("enter employee Name : ");
					String name=sc.nextLine();
					System.out.println("enter employee Salary  : ");
					double salary=sc.nextDouble();
					
					list.set(i,new Crud(uid,name,salary));
					return;
					
				}
			}
			
		}
	}
	
	public static void Search()
	{
		if(list.isEmpty())
		{
			System.out.println("List is empty !!");
			
		}
		else {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter employee id  you Want Search : ");
			int sid=sc.nextInt();
			for(int i=0;i<list.size();i++)
			{
				Crud c=list.get(i);
				if(c.getid() == sid)
				{
					System.out.println("Employee found of index  : "+i);
					return;
				}
				else {
					System.out.println("Employee Not found !!");
				}
				
				
			}
			
			
			
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		
		while(true)
		{
			System.out.println();
			System.out.println("1.insert");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.println("5.Search");
			System.out.println("enter your Choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: addEmployee();
						break;
				case 2: display();
						break;
				case 3: delete();
						break;
				case 4: updateEmp();
						break;
				case 5: Search();
						break;
				default: System.out.println("Enter Valid choice");
						break;
				 		
			}
			
		}
			
	}
	
	
	
	
	
}
