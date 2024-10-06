package assignments;



public class Assignment49 {
	Assignment49()
	{
		System.out.println("Non parameterized constructor");
	}
	
	Assignment49(int a){
		System.out.println("print parameterized contructor");
	}
	
	
    public static void main(String[] args) {
	//creating object 
    	
    	Assignment49 con=new Assignment49();//called non parameterized constructor
    	new Assignment49(10);//calling parameterized constructor
    	
    }
}
