package string_program;

public class String_Functions1 {
	public static void main(String[] args) {
		//printing name
		String name="SHilpa";
		System.out.println(name); 
		
		//printing length of name
		int size=name.length();
		System.out.println(size);
		
		//printing tolppercase
		String lc=name.toLowerCase();
		System.out.println(lc);
		
		//printing touppercase
		String Uc=name.toUpperCase();
		System.out.println(Uc);
		
		//Trim String function 
		String word="    Welcome to Java Class    ";
		System.out.println(word);//printing word before trim
		
		//print word after trim function
		String t=word.trim();
		System.out.println(t);
		
		
		//SubString index display
		String ss="ShilpaSunil";
		String sub=ss.substring(4);//from index 4 word is displaying
		System.out.println(sub);
		
		//sub string (index1,index2) displays 
		//index1= starting from 0
		//index2=ending index-1 we need to do and display 
		String sub2=ss.substring(5, 10);
		System.out.println(sub2);
		
		
		
	}

}
