package basics;
public class UpdateValueOfGlobalVariable {
	
	String name="Shilpa B N";//non static global variable
	static double salary=68685;//static global variable
	//global variable values always should update inside the main method means locally
	
	public static void main(String[] args) {
		
		System.out.println(salary);//output before updating the static global variable
		double salary=80787;//updated global static variable value
		System.out.println("---------------------");
		System.out.println(salary);//output After updating the static global variableSS
		
		UpdateValueOfGlobalVariable GV=new UpdateValueOfGlobalVariable();
		
		System.out.println("---------------------");
		System.out.println(GV.name);//output before updating the Non static global variable
		
		System.out.println("---------------------");
		
		GV.name="Shilpa Sunil";//updated global non static variable value
		System.out.println(GV.name);//output After updating the Non static global variable	
	}
}
