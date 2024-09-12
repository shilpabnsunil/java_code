package basics;

public class Static_NonStaticMethod {
	
	static void addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	static void subtraction()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		addition();
		subtraction();
		Static_NonStaticMethod NS=new Static_NonStaticMethod();
		NS.division();
		NS.modules();
	}
	
	void division() {
		int a=10;
		int b=20;
		int c=b/a;
		System.out.println(c);
	}
	void modules() {
		int a=10;
		int b=20;
		int c=b%a;
		System.out.println(c);
		
	}
	

}
