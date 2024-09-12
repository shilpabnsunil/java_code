package basics;

public class ArithmaticOperators {
	
	public static void main(String[] args) {
		addition();//calling addition method 
		subtraction();
		multiplication();
		division();
		moduls();
		
	}
	static void addition ()
	{
		int a=10;//Declaration and intialization of dataype 
		int b=20;//Declaration and intialization of dataype 
		int c=a+b;//addition operation
		System.out.println(c);
	}
	
	static void subtraction ()
	{
		int a=10;//Declaration and intialization of dataype 
		int b=20;//Declaration and intialization of dataype 
		int c=a-b;//addition operation
		System.out.println(c);
	}
	
	static void multiplication ()
	{
		int a=10;//Declaration and intialization of dataype 
		int b=20;//Declaration and intialization of dataype 
		int c=a*b;//addition operation
		System.out.println(c);
	}
	
	static void division ()
	{
		int a=10;//Declaration and intialization of dataype 
		int b=20;//Declaration and intialization of dataype 
		int c=b/a;//addition operation
		System.out.println(c);
	}
	
	static void moduls ()
	{
		int a=10;//Declaration and intialization of dataype 
		int b=20;//Declaration and intialization of dataype 
		int c=b%a;//addition operation
		System.out.println(c);
	}

}
