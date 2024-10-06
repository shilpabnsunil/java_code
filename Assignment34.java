package assignments;

import java.util.Arrays;

public class Assignment34 {
	
	public static void main(String[] args) {
		String s1="ram";
		String s2="arm";
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean b1=Arrays.equals(c1,c2);
		if(b1==true)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		
	
	}
	

}
