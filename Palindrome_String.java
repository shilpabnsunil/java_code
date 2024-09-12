package string_program;

public class Palindrome_String {
	
	public static void main(String[] args) {
		
		String s1="mom";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1=s1.charAt(i);
			s2=s2+c1;
		}
		System.out.println(s2);
		
		if(s2.equals(s1))
		{
			System.out.println("Given character is plindrome");
		}
		else
			
		{
			System.out.println("Given character is not plindrome");
		}
		
	}
	
	
	

}
