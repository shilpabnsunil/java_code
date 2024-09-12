package string_program;

public class String_Functions3 {
	
	public static void main(String[] args) {
		
     //String function contains 
	//checking in given string BN is Contains or not 
	String s1="Shilpa Sunil";
	boolean ss=s1.contains("BN");
	System.out.println(ss);
	
	//String matches 
	//check if given string ends with "l" 
	//(.*)-syntax of multi character search
	//in given string not ends with l
	String s2="School";
	boolean mm=s2.matches("(.*)l");
	System.out.println(mm);
	
	//Check given strings start with "l"
	String s3="javal";
	boolean mm1=s3.matches("l(.*)");
	System.out.println(mm1);
	
	//Check if in given string "a" is present or not 
	String s4="Shilpa B N";
	boolean mm2=s4.matches("(.*)a(.*)");
	System.out.println(mm2);
	
	//in given string contains 4 letters or not 
	String s5="java";
	boolean mm3=s5.matches("....");
	System.out.println(mm3);
	
	//CharAt(index) pring the index number at which the character is present 
	//ATChar $ index character J is present
	String s6="Corejava";
	char c1=s6.charAt(4);
	System.out.println(c1);
	
	//IndexofChar- find letter v index number
	//index stored in integer datatype
	int c2=s6.indexOf('v');
	System.out.println(c2);
	

	}
}
