package string_program;
public class String_equals_function2 
{
public static void main(String[] args) 
{
String s1="Shilpa";
String s2="shilpa";
//String function Equals 
boolean b1=	s1.equals(s2);
System.out.println(b1);

//String Equals ignore case function
boolean b2=	s1.equalsIgnoreCase(s2);
System.out.println(b2);

String s5="sunil";	
//String Concat function 
String s3=	s1.concat(" BN ").concat(s5);
			System.out.println(s3);
			
String s4=	s1.concat(" ").concat("B N");
			System.out.println(s4);
			
	//String Replace signal alphabets Function 
	
	String s7=s1.replace('i', 'z');
    System.out.println(s7);
    
//String replaceAll
String s8="Dhanvi Gowda";
String s9=s8.replaceAll("Gowda", "Sunil");
System.out.println(s9);

//String Replace all alphabets with nothing
String name="kv no 2 bangalore";
String s44=	name.replaceAll("[a-z]", "");
System.out.println(s44);

//String Replace all numbers with nothing
String nameofsinger="50 cent";
String s99= nameofsinger.replaceAll("[0-9]", "");		
System.out.println(s99);

//String replace All capital letter with nothing
String name1="Manish Tiwari";
String s41=	name1.replaceAll("[A-Z]", "");
System.out.println(s41);

//String remove all spaces 
String name22="My Name Is Shilpa B N";
String s55=name22.replaceAll(" ", "");
System.out.println(s55);

}
}
