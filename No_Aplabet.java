package string_program;

public class No_Aplabet {
	public static void main(String[] args) {
		
		
		int cout_alphabet=0;
		 String str1="shilpa12345";
		 int l1=str1.length();
		 System.out.println(l1);
		  char[] c1=str1.toCharArray();
		  for(int i=0;i<str1.length();i++) {
			  
			  boolean b1=Character.isLetter(c1[i]);	
			  if(b1==true)
			  {
				  cout_alphabet++;
			  }
		  }
		  System.out.println(cout_alphabet);
		 }
	
		

           
}