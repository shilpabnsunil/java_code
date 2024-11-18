package programs;
class college{
	
	static void teacher_name() {
		System.out.println("print static method by college");
		}
	void teacher_name2() {
		System.out.println("print non static method by college");
	}
}

class teacher extends college{
	static void selenium() {
		System.out.println("print static class method by teacher");
	}
	void java() {
		System.out.println("print non static class method by teacher");
	}
}

public class MultiLevel_Inheritance_sameClass extends teacher//multi level inheritance 
//calling both static and non static method by inheritance
{
	public static void main(String[] args) {
		
		selenium();//inherting class teacher non static method
		MultiLevel_Inheritance_sameClass H=new MultiLevel_Inheritance_sameClass();
		H.java();
		teacher_name();
		H.teacher_name2();
	}

}
