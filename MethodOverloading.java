package basics;

public class MethodOverloading {
	
	static void method1(int a) 
	{
		System.out.println(a);
	}
	
	static void method1(float b)
	{
		System.out.println(b);
	}
	
	void method1(double c) 
	{      //nonstatic method 
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		method1(20);//passing parameter int value
		method1(20f);//passing parameter float value
		MethodOverloading NS=new MethodOverloading();
		NS.method1(10.33);
	}

}
