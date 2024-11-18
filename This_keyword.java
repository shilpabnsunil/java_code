package programs;

public class This_keyword {
	
	int student_id;
	String name;
	double salary;
	
	void Student_details(int student_id,String name,double salary) {
		System.out.println("TOPPER");
		this.student_id=student_id;
		this.name=name;
		this.salary=salary;
	// this keyword can only be applied when method parameter are same as global veriable
		//ex:-int =int
		//this keyword can applies for non static method and non static global variable
	}
	
	public static void main(String[] args) {
		
		//this keyword in java cAN use to assign the value of local 
		//variable to global variable
		//this keyword can oly be used in  non static method
		//in java value will always be assigned to right hand side to left hand side
		This_keyword t1=new This_keyword();
		t1.Student_details(85,"shilpa",99877.8);
		System.out.println(t1.salary);
		System.out.println(t1.name);
		System.out.println(t1.student_id);
		
		
	}

}
