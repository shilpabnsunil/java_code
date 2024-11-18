package programs;

	class Amazon_Login
	{
		private	String un="contact@grotechminds.com";

		public String getUn() //getter method
		{
			return un;
		}
		public void settUn(String un)//setter method
		{
			this.un=un;
		}	
	}
	
	public class Encapsulations_Concept 
	{
	public static void main(String[] args) 
	{
		Amazon_Login a1=new Amazon_Login();
		a1.settUn("shilpa@gmail.com");
		//a1.setPwd("shilpa@15");
		
		System.out.println(a1.getUn());
//		System.out.println(a1.getPwd());

	}
	}
