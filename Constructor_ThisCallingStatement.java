package programs;

public class Constructor_ThisCallingStatement {
	
	
  Constructor_ThisCallingStatement(int a){
		System.out.println("call using this int");
	}
   Constructor_ThisCallingStatement(double b){
	   this(12);
   	System.out.println("call using this double");
       }
    Constructor_ThisCallingStatement(String s){
    	this(12.12);
    	System.out.println("call using this String");
	
     }
    Constructor_ThisCallingStatement(){
    	this("s");
    	System.out.println("call noparameterized constructor");
		
	}
	
	
	public static void main(String[] args) {
	  
		Constructor_ThisCallingStatement t=new Constructor_ThisCallingStatement();
	}

}
