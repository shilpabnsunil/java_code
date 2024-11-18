package programs_Interface;

abstract class facebook_auth{
	abstract void fb_login();
	abstract void fb_registration();
}
abstract class google_auth extends facebook_auth{
	
	abstract void google_login();
	abstract void google_registration();
	
}
public class Pratice_AbstratClass extends google_auth {

	void google_login() {
		
		
	}
	void google_registration() {
		
		
	}
	void fb_login() {
		
		
	}
	void fb_registration() {
		
	}

}
