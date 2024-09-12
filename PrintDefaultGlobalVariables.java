package basics;

public class PrintDefaultGlobalVariables {
	
	
	int a;//default int value 0
	double b;//default double value 0.0
	boolean c;//default boolean value false
	String S;//default string value is null
	public static void main(String[] args) {
		
		PrintDefaultGlobalVariables GV=new PrintDefaultGlobalVariables();
		System.out.println(GV.a);
		System.out.println(GV.b);
		System.out.println(GV.c);
		System.out.println(GV.S);
		
		
		
		
	}

}
