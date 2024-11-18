package programs;
class google{
	void login()
	{
		System.out.println("login with mobile nmber");
	}
}
public class Overridding_Concepts extends google{
	
	void login() {
		super.login();//super keyword call parent class method 
		//super in java oly use in method overridding to call
		//parent class implementation to gather with child class
		//super keyword can oly use in non static method 
		System.out.println("login with email id");
	}
	
public static void main(String[] args) {
	
	Overridding_Concepts a=new Overridding_Concepts();
	a.login();
	
}
}
