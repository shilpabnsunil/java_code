package basics;

public class Constructor_Overloading {
	
	Constructor_Overloading()
	{
		System.out.println("Non parameterized constructor");
	}
	
	Constructor_Overloading(int a){
		System.out.println("print parameterized contructor");
	}
	
	
    public static void main(String[] args) {
	//creating object 
    	
    	Constructor_Overloading con=new Constructor_Overloading();//called non parameterized constructor
    	new Constructor_Overloading(10);//calling parameterized constructor
    	
}
}
