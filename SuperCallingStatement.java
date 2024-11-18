package programs;

 class ParentClass{
	 
	 //parent class constructor
	 ParentClass(){
		 
		 System.out.println("parent class constructor");
	 }
}
public class SuperCallingStatement extends ParentClass
{	
	//implicity super calling statement invoked
	  SuperCallingStatement()
	  { //childClass Constructor
		  
		  }
	 
	public static void main(String[] args) {
		
		SuperCallingStatement Hin=new SuperCallingStatement();	
	}
}
