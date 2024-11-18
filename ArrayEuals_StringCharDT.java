package assignments;

import java.util.Arrays;

public class ArrayEuals_StringCharDT {
	public static void main(String[] args) {
		
		String Name1[]=new String[3];
		Name1[0]="jack";
		Name1[1]="paul";
		Name1[2]="peter";
		String Name2[]=new String[3];
		Name2[0]="jack";
		Name2[1]="paul";
		Name2[2]="peter";
		//compare two string array datatype
		boolean b1=Arrays.equals(Name1, Name2);
		System.out.println(b1);
		
		char grade1[]=new char[3];
		grade1[0]='A';
		grade1[1]='B';
		grade1[2]='C';
		char grade2[]=new char[3];
		grade2[0]='A';
		grade2[1]='B';
		grade2[2]='C';
		//compare 2 char array datatype
		boolean b2=Arrays.equals(grade1, grade2);
		System.out.println(b2);
		
								
		
	}

}
