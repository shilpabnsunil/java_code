package basics;

public class LogicalOperators {
	
	static void AND_Operator() { //AND Operator
		int age=33;
		
	   if(33 >=age && age==33) //both condition should be true than the result will be true
		{//if one condition is false output will be false
			System.out.println("True-AND Operator");
		}else {
			System.out.println("False");
		}
	}
	
	static void OR_Operator() {
		
		int a=10;
		int b=20;
		int c=a+b;
		if(c<b || c>=b) { //Any one condition is true than output true
			System.out.println("true- OR Operator");
		}
		
	}
	void NOT_OPerator()
	{
		int a=20;
		int b=30;
		int c=a-b;
		if(!(a==b && c>=40))//OR Operator both condition False ,so output True 
		{
			System.out.println("True-not operator");
		}
	}
	
	
	public static void main(String[] args) {
		AND_Operator();
		OR_Operator();
		LogicalOperators NS=new LogicalOperators();
		NS.NOT_OPerator();
	}

}
