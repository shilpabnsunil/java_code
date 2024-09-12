package basics;

public class CallingStaticMethod {

	public static void main(String[] args) {
		
		System.out.println("main method");
		method();

	}
	public static void method() {
		System.out.println("execute static method");
	}

}
