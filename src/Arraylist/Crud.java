package Arraylist;

import java.util.*;
public class Crud {

	 int id;
	 String name;
	 double salary;
	 
	 public Crud(int id,String name,double salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 
	 }
	 
	
	  public int getid()
	  {
		  return id;	 
	  }
	  
	  public String getname()
	  {
		  return name;
	  }
	  
	  public double getsalary()
	  {
		  return salary;
	  }
	  
}

