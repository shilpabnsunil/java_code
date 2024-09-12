package string_program;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String input="java";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			//System.out.print(c1);
			output=output+c1;
			
		}
		
		System.out.println(output);
	}

}
