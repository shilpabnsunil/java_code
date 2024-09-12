package basics;

public class CallingMultipleStaticMethods {
	
	public static void main(String[] args) {
		
		method1();
		method2();
		System.out.println("main Method");
		method3();
		method4();
		method5();
	}
	
	public static void method1() {
		System.out.println("ac-public,modifier-s,return type-void,method name-method1,NP");
	}
	
	private  static void method2() {
		System.out.println("ac-private,modifier-S,returntype-void,method name-method2,NP");
	}
	protected static void method3() {
		System.out.println("ac-protected,modifier-S,returntype-void,method name-method3,NP");
	}
	
	 static void method4() {
		System.out.println("ac-default,modifier-S,returntype-void,method name-method4,NP");
	}
	 
	 static void method5() {
			System.out.println("ac-default,modifier-S,returntype-void,method name-method5,NP");
			
		}
		 
}
