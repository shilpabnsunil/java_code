package programs_Interface;

		class AMZ_Class
	{
			final void auth()
		{
			System.out.println("Login with Email id");
		}
	}
	public class Final_MethodOverride extends AMZ_Class
	{
		void mobile_no()
		{
			System.out.println("Login with mobile no");
		}
	public static void main(String[] args) 
	{
		Final_MethodOverride m1=new Final_MethodOverride();
		m1.auth();
		m1.mobile_no();
	}
	}


