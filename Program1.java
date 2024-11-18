package stringbuffer_stringbuilder;

public class Program1 {
	
	
	public static void main(String[] args) 
	{
String oldstring=new String("Shilpa");
	
	    oldstring.concat("Sunil");
		System.out.println(oldstring);
		//Immutable- string variable not changed but string will stored in different variable 

		StringBuilder s1=new StringBuilder("dhanvi");
			
			s1.append(" Gowda ");
			System.out.println(s1);
		//Mutable--string variable will change and can be stored to same variable
			
         StringBuffer s2=new StringBuffer("Hima");
			
			s2.append(" Shree");
			System.out.println(s2);
			//Mutable--string variable will change and can be stored to same variable

		
	}

}
