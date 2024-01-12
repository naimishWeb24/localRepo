package practice;

public class addition implements demo{

	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is : "+sum);
	}
	public static void main(String[] args)
	{
		addition a=new addition();
		a.add(10, 20);
	}
	
}
