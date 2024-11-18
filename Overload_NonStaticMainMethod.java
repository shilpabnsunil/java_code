package programs;

public class Overload_NonStaticMainMethod {
	
	 void main() 
	{
		System.out.println("1");
	}
	
	 void main(int a ) 
	{
		System.out.println("int");
	}
	 void main(double b) 
	{
		System.out.println("double");
	}
	 void main(String s) 
	{
		System.out.println("String");
	}
	
	public static void main(String[] args) {
		
		Overload_NonStaticMainMethod ref=new Overload_NonStaticMainMethod();
		ref.main();
		ref.main(1);
		ref.main(2.3);
		ref.main("shilpa");
		
	}

}
