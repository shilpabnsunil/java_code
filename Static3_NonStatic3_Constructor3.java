package basics;

public class Static3_NonStatic3_Constructor3 {
	
	static void Smethod(int a,int b) {
		if(a>b) {
			System.out.println(true);
		}
	}
	static void Smethod(int a,double b) {
		if(a<b || a>b) {
			System.out.println(true);
		}
	}
	static void Smethod(long a,double b) {
		if(a==b && a>b) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}	
	}
	void NSmethod(int a,int b) {
		int c=a+b;
		System.out.println(c);
		}
	void NSmethod2(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	void NSmethod2(double a,float b)
	{
		if(a<=b ||  a==b)
		{
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	Static3_NonStatic3_Constructor3(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	Static3_NonStatic3_Constructor3(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	Static3_NonStatic3_Constructor3(double a,float b){
		double c=b/a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Smethod(30, 20);//calling parameterized static method
		Smethod(10,10.5);//calling parameterized static method
		Smethod(100l,100.5);//calling parameterized static method
		Static3_NonStatic3_Constructor3 NS=new Static3_NonStatic3_Constructor3(1,1);
		NS.NSmethod(10,20);//calling non parameterized static method
	    NS.NSmethod2(50,100);//calling non parameterized static method
	    NS.NSmethod2(2.1,1.1f);//calling non parameterized static method
		new Static3_NonStatic3_Constructor3(1, 2.2);//calling parameterized constructor 
		new Static3_NonStatic3_Constructor3(4.2, 2.2f);//calling parameterized constructor
	}

}
