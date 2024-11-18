package programs;

 class First   //parent class
{
	static void house() {
		System.out.println("print static method from different class" );
		
	}
	static void car() {
		
	}
	static void bike() {
		
	}
}

public class Inheritance extends  First//child class

{
	//inherting static methods from same and class and from different class
	//we can call static methods from same or different class by its
	//methos name or className.methodname.
	static void mobile() {
		System.out.println("print static method from same class" );
		
	}
	static void laptop() {
		
	}
	public static void main(String[] args) {
		mobile();//static method from same class
		house();//static method from different class
		
		
	}

}
