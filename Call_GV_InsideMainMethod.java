package basics;

public class Call_GV_InsideMainMethod {
	
	
	String name="Shilpa B N";//non static global variable
	static double salary=607876;//static global  variable
	
	
	public static void main(String[] args) {
		
		System.out.println(salary);//calling static global variable
		Call_GV_InsideMainMethod NS_GL=new Call_GV_InsideMainMethod();
		System.out.println(NS_GL.name);	//calling non static Global variables
		//to call non static global variable we need to create object and call 
				
		
	}

}
