package basics;

public class NonStaticMethod {
	
	
	void add() {
		System.out.println("addition a+b");
	}
	
	public static void main(String[] args) {
		
		NonStaticMethod NS=new NonStaticMethod();//Creation of object and variable name
		NS.add();//calling non static method
		
	}

}
